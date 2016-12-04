package test;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;




/*


/**
 *
 * @author Regis
 */
public class StrinOperation {
  public static void main(String[] args) throws InterruptedException, IOException {
        Path dir = Paths.get("D://TestDir");
  FileVisitorClass vst = new FileVisitorClass(dir);
vst.processEvents();
    
  }
    
}
