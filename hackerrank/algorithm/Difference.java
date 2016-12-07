/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithm;

/**
 *
 * @author Regis
 */
class DemoDifference{
    int [] element;
    int max=0;
    public DemoDifference(int []element){
        this.element=element;
        
    }
    public void computeDifference(){
        
        int difference;
        for (int i = 0; i < element.length; i++) {
            for (int j = 0; j < element.length; j++) {
                if (element[i]>element[j]) {
                    difference=element[i]-element[j];
                }
               else  if (element[i]<element[j]) {
                    difference=element[j]-element[i];
                }
               else {
                   difference=element[i]-element[j];
               }
                if(max<difference){
                   max=difference; 
                }
            }
 
        }
       
    }
    public int maximumDifference(){
        return max;
    }
}
public class Difference {
    public static void main(String[] args) {
    DemoDifference d =    new DemoDifference(new int [] {1,2,5});
               d.computeDifference();
               System.out.println(d.maximumDifference());
       
    }
    
}
