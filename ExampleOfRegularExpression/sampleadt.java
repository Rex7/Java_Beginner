/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleOfRegularExpression;

/**
 *
 * @author Regis
 */
public class sampleadt {
    public static void main(String ...args)
    {
       float c = 0;
       float holiday = 0;
       String []s={"present","absent","","absent"};
        int len=s.length;
        while(len!=(s.length-1))
        {
            for(int i=0;i<s.length;i++)
            {
                String name=s[i];
                System.out.println("name"+name);
                if(s[i].equalsIgnoreCase("present"))
                {
                    c++;
                }
                else
                    if("".equals(name))
                    {
                        holiday++;
                    }
            }
            len=s.length-1;
            System.out.println("value of c"+c+"value holiday"+holiday);
            
            
            
        }
    }
}
