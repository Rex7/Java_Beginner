package Demo;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;

public class DirectoryWatchDemo{
    public static void main(String[] args) throws IOException, InterruptedException {
        Path dir = Paths.get("D:");
        WatchService watchservice = FileSystems.getDefault().newWatchService();
        dir.register(watchservice,StandardWatchEventKinds.ENTRY_CREATE,
        StandardWatchEventKinds.ENTRY_DELETE,StandardWatchEventKinds.ENTRY_MODIFY);
        while(true){
            WatchKey watchkey;
            watchkey = watchservice.take();
            for(WatchEvent<?> events:watchkey.pollEvents()){
                Path file = dir.resolve((Path)events.context());
                if(events.kind()==StandardWatchEventKinds.ENTRY_CREATE){
                    System.out.println("File Created : "+file); 
                }
                else if(events.kind()==StandardWatchEventKinds.ENTRY_DELETE){
                    System.out.println("file is deleted: "+file);
                }
                else if (events.kind()==StandardWatchEventKinds.ENTRY_MODIFY){
                    System.out.println("File has been modified:"+file);
                }
                
              
                
                
            }
            boolean valid = watchkey.reset();
            if(!valid){
                break;
            }
            
        }
    }
    
}