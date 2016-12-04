/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JustSimpleProgram;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Regis
 */
public class URLdemo {
    public static void main(String[] args) {
        try
        {
        URL l = new URL("http://www.google.com/index.html");
            System.out.println("Port"+l.getPort());
            System.out.println("Protocol"+l.getProtocol());
            System.out.println("host"+l.toExternalForm());
            System.out.println("Host"+l.getHost());
            System.out.println("File"+l.getFile());
    }
        catch(MalformedURLException e)
        {
            System.out.println("Sorry url is not right"+e.getMessage());
        }
}
}
