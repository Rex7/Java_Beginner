package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Regis
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
        Path path = Paths.get("D:\\regis");
      FileVisitorClass visit = new FileVisitorClass(path); 
      visit.processEvents();
    }
}

