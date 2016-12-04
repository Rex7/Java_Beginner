/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Regis
 */
public class NewClass {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("C:\\Users");
        Java8WatchServiceExample ps = new Java8WatchServiceExample(p);
        ps.processEvents();
        
        
    }
    
}
