/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import net.contentobjects.jnotify.JNotify;
import net.contentobjects.jnotify.JNotifyListener;
import net.contentobjects.jnotify.JNotify;

/**
 *
 * @author Regis
 */
public class JNotifyDemo{
    


  public void sample() throws Exception {
    // path to watch
      System.loadLibrary("JNotify_64bit");
    String path = System.getProperty("user.home");

    // watch mask, specify events you care about,
    // or JNotify.FILE_ANY for all events.
    int mask = JNotify.FILE_CREATED  | 
               JNotify.FILE_DELETED  | 
               JNotify.FILE_MODIFIED | 
               JNotify.FILE_RENAMED;

    // watch subtree?
    boolean watchSubtree = true;

    // add actual watch
    int watchID = JNotify.addWatch(path, mask, watchSubtree, new Listener());

    // sleep a little, the application will exit if you
    // don't (watching is asynchronous), depending on your
    // application, this may not be required
    Thread.sleep(1000000);

    // to remove watch the watch
    boolean res = JNotify.removeWatch(watchID);
    if (!res) {
      // invalid watch ID specified.
    }
  }
}
  class Listener implements JNotifyListener {
    @Override
    public void fileRenamed(int wd, String rootPath, String oldName,
        String newName) {
      print("renamed " + rootPath + " : " + oldName + " -> " + newName);
    }
    @Override
    public void fileModified(int wd, String rootPath, String name) {
      print("modified " + rootPath + " : " + name);
    }
    @Override
    public void fileDeleted(int wd, String rootPath, String name) {
      print("deleted " + rootPath + " : " + name);
    }
    @Override
    public void fileCreated(int wd, String rootPath, String name) {
      print("created " + rootPath + " : " + name);
    }
    void print(String msg) {
      System.err.println(msg);
    }
  }
