/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netpacket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Regis
 */
public class NetS {
    public static void main(String ...args) throws MalformedURLException, IOException
    {
        long no=1234561234l;
    String urlParameters  = "username=angell&password=abhi1234&phoneno="+no+"&emailid=sawantabhijeet1998@gmail.com";
byte[] postData       = urlParameters.getBytes(  );
int    postDataLength = postData.length;
String request        = "http://rex7.16mb.com/simple.php";
URL    url            = new URL( request);
HttpURLConnection conn= (HttpURLConnection) url.openConnection(); 

conn.setDoOutput( true );
conn.setInstanceFollowRedirects( false );
conn.setRequestMethod( "POST" );
conn.setRequestProperty( "Content-Type", "application/x-www-form-urlencoded"); 
conn.setRequestProperty( "charset", "utf-8");
conn.setRequestProperty( "Content-Length", Integer.toString( postDataLength ));
conn.setUseCaches( false );
try( DataOutputStream wr = new DataOutputStream( conn.getOutputStream())) {
   wr.write( postData );
   wr.flush();
   InputStream in=conn.getInputStream();
   BufferedReader br = new BufferedReader(new InputStreamReader(in));
   String line=br.readLine();
   while(line!=null)
   {
       System.out.println(line);
       line=br.readLine();
   }
}
    }
}
