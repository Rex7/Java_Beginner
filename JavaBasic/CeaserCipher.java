/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

/**
 *
 * @author Regis
 */
public class CeaserCipher {
    public static void main(String[] args) {
         StringBuffer buffer = new StringBuffer();
        int n=10;
        char[] char_array ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String data="hey my name is regis";
        for(int i=0;i<data.length();i++){
            char c=data.charAt(i);
         
            for(int j=0;j<char_array.length;j++){
                
                if(c==char_array[j]){
                   int index=j;
                   if(index==25&& n<25){
                       buffer.append(char_array[-1+n]);
                   }
                   else if(index!=25 && n>25){
                       System.out.println("this part");
                   }
                   else {
                       try{
                       buffer.append(char_array[index+n]);
                      
                       }
                            catch(ArrayIndexOutOfBoundsException exception){
                            int val= -((char_array.length)-index);
                            buffer.append(char_array[val+n]);
                            
                           
                         
                          
                       }
                   }
                   
                }
                
            }
        }
        System.out.println("Original Data : "+data);
        System.out.println("encrypted data :"+buffer);
    }
    
}
