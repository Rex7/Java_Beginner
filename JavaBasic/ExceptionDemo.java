
package JavaBasic;

/**
 *
 * @author Regis
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        int a = 15, b = 0, c;
        /*
        Note: A single exeption class can catch all exception, when uncertain which exception will be thrown 
        use Exception in catch method
        ex
        try{
        
        }
        catch(Exception ex){
        //this is will catch all exception
        }
        */
        StringBuffer buffer = null;
        try {
            buffer.append("regis");//this will throw nullpointer
            int array[] = {56};
            array[5] = 89;//this will give ArrayIndexOutOfBoundsException
            c = a / b;//this will throw ArithmeticException
            System.out.println(c);
            System.out.println("StringBuffer " + buffer);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }

    }

}
