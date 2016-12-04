/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JustSimpleProgram;

/**
 *
 * @author Regis
 */
import java.net.UnknownHostException;
import java.net.InetAddress;
public class InetDemo {
    public static void main(String[] args) {
        try
        {
        InetAddress in = InetAddress.getByName("google.com");
            System.out.println("Address"+in.getHostName());
            System.out.println("hostAddress"+in.getHostAddress());
    }
        catch(UnknownHostException e)
        {
            System.out.println("Error Message "+e.getMessage());
        }
}
}