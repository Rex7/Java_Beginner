/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JustSimpleProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author Regis
 */
public class DatabaseDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/babe";
        String user="root";
        String pass="";
        Connection con =DriverManager.getConnection(url, user,pass);
        PreparedStatement pst = con.prepareStatement("select * from student");
        ResultSet rst = pst.executeQuery();
        ResultSetMetaData mst = rst.getMetaData();
       
        while(rst.next())
        {
            System.out.println("name"+rst.getString(1));
            System.out.println("rollno"+rst.getString(2));
            
            System.out.println("Percentage"+rst.getString(3));
        }
        con.close();
    }
    
}
