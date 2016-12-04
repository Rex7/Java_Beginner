/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justdemo;

/**
 *
 * @author Regis
 */

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
public class TreeVisitor extends SimpleFileVisitor {

    @Override
    public FileVisitResult postVisitDirectory(Object dir, IOException exc) throws IOException {
        System.out.println("File has been visited"+dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Object file, IOException exc) throws IOException {
        System.err.println(exc.getMessage());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {
            if(attrs.isDirectory()){
                System.out.println("Directory :"+file);
            }
            else if(attrs.isRegularFile()){
                System.out.println("File is a regular file :"+file);
            }
            return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs) throws IOException {
        if(attrs.isDirectory()){
            System.out.println("Directory about to visit is :"+dir);
        }
        else if(attrs.isRegularFile()){
            System.out.println("File about to visited is :"+dir);
        }
        return FileVisitResult.CONTINUE;
    }
    
}
