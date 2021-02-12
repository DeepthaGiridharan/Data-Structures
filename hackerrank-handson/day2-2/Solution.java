import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         int h1=s.charAt(0)-'0';
         int h2=s.charAt(1)-'0';
         char ap=s.charAt(8);
         String result;
        /* System.out.print(h1+","+h2);
         System.out.print(ap);*/
         
         if(ap=='A'){

                     h2=(h1*10)+h2;
                     if(h2==12){
                      h2=0;
                     }
                     

                 
             }
        if(ap=='P'){
            h2=(h1*10)+h2;
            if(h2!=12){
            h2=(h2+12)%24;
            }
            

        }
        if(h2>=0&&h2<=9){
            
            result="0"+String.valueOf(h2)+s.substring(2,8);
        }
            
       else{
            result=String.valueOf(h2)+s.substring(2,8);
        }
        
       /*System.out.print(result);*/
        return result;


        
         

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
