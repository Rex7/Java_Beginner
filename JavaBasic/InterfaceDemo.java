
package JavaBasic;

import java.util.Scanner;

/**
 *
 * @author Regis
 */
interface admin {

    public void setUser(String user, int pass);

    public void displayUser();
}
interface superuser extends admin{
    public void giveAll();
}
class Super implements superuser{
    String user ;
    int pass;
    @Override
    public void giveAll() {
        System.out.println("All rights given");
    }

    @Override
    public void setUser(String user, int pass) {
        this.user=user;
        this.pass=pass;
    }

    @Override
    public void displayUser() {
        System.out.println("Super User created ");
        System.out.println("UserName :" + user + "\nPassword " + pass);
    }
    
}

class User implements admin {

    private String username;
    int password;

    @Override
    public void setUser(String user, int password) {
        username = user;
        this.password = password;
    }

    @Override
    public void displayUser() {
        System.out.println("User created ");
        System.out.println("UserName :" + username + "\nPassword " + password);
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //below step is possible due to is-a relationship
        admin person = new User();
        Super SuperUser = new Super();
        System.out.println("Enter username ");
        String user = input.next();
        System.out.println("Enter Password");
        int pass = input.nextInt();
        person.setUser(user, pass);
        person.displayUser();
        SuperUser.setUser(user, pass);
        SuperUser.giveAll();
        SuperUser.displayUser();

    }
}
