package test;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*


+ sign indicates atleast one instance or more than one
? sign indicates zero or one instance 
* zero or more than one




*/

/**
 *
 * @author Regis
 */
public class RegrexForEmailCheck {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        String name;
        System.out.println("Enter Email Id");
        name=rs.next();
        String pattern = "\\D*[a-zA-Z]+[a-zA-Z0-9]*@[a-zA-Z]+.com";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(name);
        System.out.println("Match found"+m.matches());
        
       }
        
    }
    

