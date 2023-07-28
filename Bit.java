//package Striver_CP_SHEET;

import java.util.Scanner;

public class Bit
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int take=scan.nextInt();
        int count =0;
        while(take-->0)
        {
            String str = scan.next();
            if(str.equals("++X") || str.equals("X++")) count++;
            if(str.equals("--X") || str.equals("X--")) count--;
        }
        System.out.println(count);
    }
}
