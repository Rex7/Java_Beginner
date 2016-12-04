/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netpacket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Regis
 */
//databse name=u905255759_local

//database name=local ,username=u905255759 password="Rex9821572187
public class NetConnection {
    public static void main(String...args) throws MalformedURLException, IOException
    {
        BufferedReader br;
        URL u = new URL("http://rex7.16mb.com/login.php");
        InputStream in;
        URLConnection con = u.openConnection();
        if(con instanceof HttpURLConnection)
        {
            HttpURLConnection httpURLConnection = (HttpURLConnection) con;
            
            HttpURLConnection h=(HttpURLConnection) con;
            in=h.getInputStream();
            br=new BufferedReader(new InputStreamReader(in));
            int res=h.getResponseCode();
            if(res==HttpURLConnection.HTTP_OK)
            {
                String line=br.readLine();
                while(line!=null)
                {
                    System.out.println(line);
                    line=br.readLine();
                }
            }
                
        }
        
    }
    
}
