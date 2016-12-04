package test;


import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.file.StandardWatchEventKinds;










public class Tes{
    public static void main(String[] args) {
        
        try {
            WatchService watchservice = FileSystems.getDefault().newWatchService();
            Path p  = Paths.get("D:\\regis");
            p.register(watchservice,StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_DELETE,StandardWatchEventKinds.ENTRY_MODIFY );
            Files.walkFileTree(p, new FileVisitor<Path>(){

                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    System.out.println("File");
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    System.out.println("File visited->"+file.getFileName());
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                    System.err.println("File visit error->"+exc.getMessage());
                  return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    return FileVisitResult.CONTINUE;
                }

                
                
            });
            while(true){
            WatchKey key = watchservice.take();
            for(WatchEvent<?> event :key.pollEvents()){
                System.out.println("Event"+event);
                System.out.println("events"+event.context());
            }
           boolean status = key.reset();
           if(!status){
               break;
           }
           
        }
            
            
        } catch (IOException ex) {
            Logger.getLogger(Tes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}