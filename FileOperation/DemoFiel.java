/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 *
 * @author Regis
 */
public class DemoFiel {
    public static void main(String...args) throws IOException
    {
        File ss = new File ("lovess.csv");
          FileWriter fw = new FileWriter(ss);
	BufferedWriter  bw = new BufferedWriter(fw);
        if(ss.createNewFile())
        {
            System.out.println("file created");
        }
   
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String u="jdbc:mysql://localhost/rex";
            Connection con = DriverManager.getConnection(u, "root", "");
            String sql="select * from rexx";
                PreparedStatement ps = con.prepareStatement(sql);
           ResultSet rs= ps.executeQuery();
       ResultSetMetaData s =rs.getMetaData();
            System.out.println("value at index 0"+s.getColumnName(32));
            System.out.println("column"+ s.getColumnCount());
           for(int i=1;i<=s.getColumnCount();i++)
           {
               bw.append(s.getColumnName(i));
               bw.append(",");
               
           }
           bw.append("\n");
           bw.flush();
          
      while(rs.next())
      {
          for(int i=1;i<=32;i++)
          {
            
           
             bw.append(rs.getString(i));
             bw.append(",");
             
          }
          bw.append("\n");
      }
      bw.flush();
      bw.close();
      
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
}
