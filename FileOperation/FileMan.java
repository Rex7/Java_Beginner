/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Regis
 */
public class FileMan {
    public static void main(String...ars) throws IOException, ClassNotFoundException, SQLException
    {
        File s = new File("regis.csv");
        if(!s.exists())
        {
            s.createNewFile();
        }
        FileWriter fw = new FileWriter(s);
        String sql="select * from rexx";
          Class.forName("com.mysql.jdbc.Driver");
            String u="jdbc:mysql://localhost/rex";
            Connection con = DriverManager.getConnection(u, "root", "");
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            int col=rs.getMetaData().getColumnCount();
            while(rs.next())
            {
                for(int i=1;i<col;i++)
                {
                    fw.append(rs.getString(i));
                    fw.append(",");
                    
                }
                fw.append("\n");
             
            }
               fw.flush();
                fw.close();
    }
    
}
