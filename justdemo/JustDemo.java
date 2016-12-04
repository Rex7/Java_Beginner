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
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

public class JustDemo {

    public static void main(String[] args) {
        Path this_dir = Paths.get(".");
        System.out.println("Now watching the current directory ...");

        try {
            WatchService watcher = this_dir.getFileSystem().newWatchService();
            this_dir.register(watcher, StandardWatchEventKinds.ENTRY_CREATE);

            WatchKey watckKey = watcher.take();

            List<WatchEvent<?>> events = watckKey.pollEvents();
            for (WatchEvent event : events) {
                System.out.println("Someone just created the file '" + event.context().toString() + "'.");

            }

        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.toString());
        }
    }
}
