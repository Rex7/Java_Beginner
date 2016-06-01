/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleOfRegularExpression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Regis
 */
public class workingnet {
    public static void main(String...arg) throws MalformedURLException, IOException
    {
        String g="";
       
        InputStream in;
        URL u = new URL("http://www.google.com");
        HttpURLConnection url=(HttpURLConnection)u.openConnection();
        url.connect();
        int res=url.getResponseCode();
        if(res==HttpURLConnection.HTTP_OK)
            
        {
            in=url.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line=br.readLine();
            while(line!=null)
            {
             g+=line;
              line=br.readLine();
            }
            System.out.println(g);
            
        }
    }
    
}
