/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

/**
 *
 * @author Regis
 */
public class TestRun {
    public static void main(String[] args) throws Exception {
        long temp=1,val;
        String real_value;
  long array1[] = new long[]{2,738197504};
   long array2[] = new long[]{2,738197504};
    int last1=array1.length-1;
     int last2=array2.length-1;
    for(int i=0;i<=last1;i++){ 
        for(int j=0;j<=last2;j++){
              temp=array2[last2-i]*array1[last1-j];
              System.out.println(temp);
              
        }
       
    }
    
       }
    
}
