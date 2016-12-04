package test;


import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.HashMap;
import java.util.Map;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.BasicFileAttributes;





/**
 *
 * @author Regis
 */
public class FileVisitorClass {

  WatchService watchservice;
  Map<WatchKey,Path> map;
public  FileVisitorClass(Path dir) throws IOException{
      
          watchservice = FileSystems.getDefault().newWatchService();
          map = new HashMap<WatchKey,Path>();
          registerWalkTreeMethod(dir);
          }
    public void registerDirectory(Path dir) throws IOException{
    WatchKey key = dir.register(watchservice,StandardWatchEventKinds.ENTRY_CREATE,
            StandardWatchEventKinds.ENTRY_DELETE,StandardWatchEventKinds.ENTRY_MODIFY);
    map.put(key, dir);
    }
  public void registerWalkTreeMethod(Path path) throws IOException{
      Files.walkFileTree(path, new SimpleFileVisitor<Path>(){

          @Override
          public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
              System.err.println("Error "+exc.getMessage()
              );
              return FileVisitResult.CONTINUE;
          }

          @Override
          public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
              if(attrs.isSymbolicLink()){
                  System.out.println("Ignore");
              }
              return FileVisitResult.CONTINUE;//To change body of generated methods, choose Tools | Templates.
          }
          

          @Override
          public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
              registerDirectory(dir);
             return FileVisitResult.CONTINUE;
          }
          
      });
  }
  public void processEvents() throws InterruptedException, IOException{
      System.out.println("Its called");
      while(true){
          WatchKey key;
          key = watchservice.take();
          Path dir = map.get(key);
          if(dir==null){
              System.out.println("sorry cant access");
          }
          for(WatchEvent events:key.pollEvents()){
              Path child = dir.resolve((Path)events.context());
              System.out.println("Event invoked ->"+events.kind()+"\n Name of the File ->"+events.context()+"\n Path:"+child);
              if(events.kind()==StandardWatchEventKinds.ENTRY_CREATE){
                  if(Files.isDirectory(child,LinkOption.NOFOLLOW_LINKS)){
                      registerDirectory(child);
                  }
              }
          }
          boolean valid=key.reset();
          if(!valid){
             map.remove(key);
          }
          if (map.isEmpty()) {
                    break;
                }
          
          
      }
  }
    
}
