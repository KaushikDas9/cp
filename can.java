package Striver_CP_SHEET;

import java.util.Scanner;

public class can
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextLong();
        if(n==9) {System.out.println(n); return;}
         double temp=n;
         double reverse=0;
           while(temp >0)
            {
                 double digit=temp%10;
                 reverse=reverse*10 +digit;
                 temp/=10;
            }

        double min=0;
           double temp2 =reverse%10;
           if( temp2 != 9)
           {
               while (reverse >= 1)
               {
                   double digit = reverse % 10;
                   if (digit >= 5) min = (min * 10) + (9 - digit);
                   else min = min * 10 + digit;
                   reverse /= 10;
               }
           }

           else {
               while (reverse >= 1)
               {
                   double digit = reverse % 10;
                   if (digit >= 5) min = (min * 10) + (9 - digit);
                   else min = min * 10 + digit;
                   reverse /= 10;
               }
               String str = String.valueOf(min);
               str = "9"+str;
               min=Double.parseDouble(str);
           }

        System.out.println(min);
    }
}