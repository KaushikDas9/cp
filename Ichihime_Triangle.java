package Striver_CP_SHEET;

import java.util.Scanner;

public class Ichihime_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int take = scan.nextInt();

        while(take-->0)
        {
            int a= scan.nextInt();
            int b= scan.nextInt();
            int c= scan.nextInt();
            int d= scan.nextInt();


//            for(int i=a;i<=d;i++)
//            {
//                if(i>=a && i<=b) x=i;
//                if(i>=b && i<=c) y=i;
//                if(i>=c && i<=d) z=i;
//            }


            System.out.print(b+" ");
            System.out.print(c+" ");
            System.out.print(c);
            System.out.println();
        }

    }
}
