
package JavaBasic;

/**
 *
 * @author Regis
 */
public class CeaserCipher {
    public static void main(String[] args) {
         StringBuffer buffer = new StringBuffer();
        //for now take key less than 25 for encryption
        int key=10;
        char[] char_array ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String data="hey my name is regis";
        for(int i=0;i<data.length();i++){
            //getting the char at the index and comparing it with char_array
            char c=data.charAt(i);
         
            for(int j=0;j<char_array.length;j++){
                
                if(c==char_array[j]){
                   int index=j;
                   if(index==25&& key<25){
                       buffer.append(char_array[-1+key]);
                   }
                   else if(index!=25 && key>25){
                       System.out.println("this part");
                   }
                   else {
                       try{
                       buffer.append(char_array[index+key]);
                      
                       }
                            catch(ArrayIndexOutOfBoundsException exception){
                            int val= -((char_array.length)-index);
                            buffer.append(char_array[val+key]);
                            
                           
                         
                          
                       }
                   }
                   
                }
                
            }
        }
        System.out.println("Original Data : "+data);
        System.out.println("encrypted data :"+buffer);
    }
    
}
