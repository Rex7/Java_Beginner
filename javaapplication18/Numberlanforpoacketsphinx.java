/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Regis
 */
public class Numberlanforpoacketsphinx {
    public static void main(String...args)
    {        
        String no="TWENTY-FIVE SIXTY TWO FOURTEEN SIXTY-TWO TWO";
        String pattern=" ";
        String [] numbers=no.split(pattern);
        String [] n = new String[numbers.length];
//      ONE TWO THREE FOUR FIVE SIX SEVEN EIGHT NINE TEN
//ELEVEN TWELVE THIRTEEN FOURTEEN FIFTEEN SIXTEEN SEVENTEEN EIGHTEEN NINETEEN TWENTY
//TWENTY-ONE TWENTY-TWO TWENTY-THREE TWENTY-FOUR TWENTY-FIVE TWENTY-SIX TWENTY-SEVEN TWENTY-EIGHT TWENTY-NINE THIRTY
//THIRTY-ONE THIRTY-TWO THIRTY-THREE THIRTY-FOUR THIRTY-FIVE THIRTY-SIX THIRTY-SEVEN THIRTY-EIGHT THIRTY-NINE FORTY
//FORTY-ONE FORTY-TWO FORTY-THREE FORTY-FOUR FORTY-FIVE FORTY-SIX FORTY-SEVEN FORTY-EIGHT FORTY-NINE FIFTY
//FIFTY-ONE FIFTY-TWO FIFTY-THREE FIFTY-FOUR FIFTY-FIVE FIFTY-SIX FIFTY-SEVEN FIFTY-EIGHT FIFTY-NINE SIXTY
//SIXTY-ONE SIXTY-TWO SIXTY-THREE SIXTY-FOUR SIXTY-FIVE SIXTY-SIX SIXTY-SEVEN SIXTY-EIGHT SIXTY-NINE SEVENTY
//SEVENTY-ONE SEVENTY-TWO SEVENTY-THREE SEVENTY-FOUR SEVENTY-FIVE SEVENTY-SIX SEVENTY-SEVEN SEVENTY-EIGHT SEVENTY-NINE EIGHTY
//EIGHTY-ONE EIGHTY-TWO EIGHTY-THREE EIGHTY-FOUR EIGHTY-FIVE EIGHTY-SIX EIGHTY-SEVEN EIGHTY-EIGHT EIGHTY-NINE NINETY
//NINETY-ONE NINETY-TWO NINETY-THREE NINETY-FOUR NINETY-FIVE NINETY-SIX NINETY-SEVEN NINETY-EIGHT NINETY-NINE ONE HUNDRED
        Scanner rs = new Scanner(System.in);
        HashMap<String,String> S = new HashMap<>();
        S.put("ONE", "1");S.put("TWO", "2");S.put("THREE", "3");S.put("FOUR", "4");S.put("FIVE", "5");S.put("SIX", "6");S.put("SEVEN", "7");S.put("EIGHT", "8");S.put("NINE", "9");S.put("TEN", "10");
        S.put("ELEVEN", "11");S.put("TWELVE", "12");S.put("THIRTEEN", "13");S.put("FOURTEEN", "14");S.put("FIFTEEN", "15");S.put("SIXTEEN", "16");S.put("SEVENTEEN", "17");S.put("EIGHTEEN", "18");S.put("NINETEEN", "19");S.put("TWENTY", "20");
        S.put("TWENTY-ONE", "21");S.put("TWENTY-TWO", "22");S.put("TWENTY-THREE", "23");S.put("TWENTY-FOUR", "24");S.put("TWENTY-FIVE", "25");S.put("TWENTY-SIX", "26");S.put("TWENTY-SEVEN", "27");S.put("TWENTY-EIGHT", "28");S.put("TWENTY-NINE", "29");S.put("THIRTY", "30");
        S.put("THIRTY-ONE", "31");S.put("THIRTY-TWO", "32");S.put("THIRTY-THREE", "33");S.put("THIRTY-FOUR", "34");S.put("THIRTY-FIVE", "35");S.put("THIRTY-SIX", "36");S.put("THIRTY-SEVEN", "37");S.put("THIRTY-EIGHT", "38");S.put("THIRTY-NINE", "39");S.put("FORTY", "40");
        S.put("FORTY-ONE", "41");S.put("FORTY-TWO", "42");S.put("FORTY-THREE", "43");S.put("FORTY-FOUR", "44");S.put("FORTY-FIVE", "45");S.put("FORTY-SIX", "46");S.put("FORTY-SEVEN", "47");S.put("FORTY-EIGHT", "48");S.put("FORTY-NINE", "49");S.put("FIFTY", "50");
        S.put("FIFTY-ONE", "51");S.put("FIFTY-TWO", "52");S.put("FIFTY-THREE", "53");S.put("FIFTY-FOUR", "54");S.put("FIFTY-FIVE", "55");S.put("FIFTY-SIX", "56");S.put("FIFTY-SEVEN", "57");S.put("FIFTY-EIGHT", "58");S.put("FIFTY-NINE", "59");S.put("SIXTY", "60");
        S.put("SIXTY-ONE", "61");S.put("SIXTY-TWO", "62");S.put("SIXTY-THREE", "63");S.put("SIXTY-FOUR", "64");S.put("SIXTY-FIVE", "65");S.put("SIXTY-SIX", "66");S.put("SIXTY-SEVEN", "67");S.put("SIXTY-EIGHT", "68");S.put("SIXTY-NINE", "69");S.put("SEVENTY", "70");
        S.put("SEVENTY-ONE", "71");S.put("SEVENTY-TWO", "72");S.put("SEVENTY-THREE", "73");S.put("SEVENTY-FOUR", "74");S.put("SEVENTY-FIVE", "75");S.put("SEVENTY-SIX", "76");S.put("SEVENTY-SEVEN", "77");S.put("SEVENTY-EIGHT", "78");S.put("SEVENTY-NINE", "79");S.put("EIGHTY", "80");
        S.put("EIGHTY-ONE", "81");S.put("EIGHTY-TWO", "82");S.put("EIGHTY-THREE", "83");S.put("EIGHTY-FOUR", "84");S.put("EIGHTY-FIVE", "85");S.put("EIGHTY-SIX", "86");S.put("EIGHTY-SEVEN", "87");S.put("EIGHTY-EIGHT", "88");S.put("EIGHTY-NINE", "89");S.put("NINETY", "90");
        S.put("NINETY-ONE", "91");S.put("NINETY-TWO", "92");S.put("NINETY-THREE", "93");S.put("NINETY-FOUR", "94");S.put("NINETY-FIVE", "95");S.put("NINETY-SIX", "96");S.put("NINETY-SEVEN", "97");S.put("NINETY-EIGHT", "98");S.put("NINETY-NINE", "99");S.put("HUNDRED", "100");
        System.out.println("enter your number from 1 to 100 in words");
        String choice=rs.nextLine();
        System.out.println("value of that number"+choice+""+S.get(choice));
        for(int i=0;i<numbers.length;i++)
        {
            String temp=S.get(numbers[i]);
            n[i]=temp;
            
           
        }
      List num=Arrays.asList(n);
      TreeSet<String> s = new TreeSet<>(num);
      for(String fin:s)
      {
          System.out.println("finally sorted array"+fin);
      }
      
       
    }
    }

    

