/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

/**
 *
 * @author Regis
 */
import java.util.*;
import java.util.regex.*;
import java.io.*;
public class file
{
public static void main(String...args) throws Exception
{
file s = new file();
File ss = new File("");

s.write();
}
public void write() throws Exception
{
    Matcher m;
Pattern ps = Pattern.compile("(0|91)?[7-9][0-9]{9}");

File f = new File("numbersfile.txt");
File outs=new File("out.txt");
PrintWriter writer= new PrintWriter(outs);
Scanner rs = new Scanner(f);
while(rs.hasNext())
{
String val=rs.next();
System.out.println("values"+val);
m=ps.matcher(val);
if(m.find()&&m.group().equals(val))
{
writer.println(val);
}
else
System.out.println("that number was not a match");
}
writer.close();

}
}
