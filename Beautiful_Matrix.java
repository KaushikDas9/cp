package Striver_CP_SHEET;

import java.util.Scanner;

public class Beautiful_Matrix
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int mat[][] = new int[5][5];
            int a=-1,b=-1;
           for(int i= 0; i <5 ; i++)
           {
               for(int j = 0; j <5 ;j++)
               {
                   mat[i][j] = scan.nextInt();
                   if(mat[i][j] == 1 ) {a=i ; b=j;break;}
               }
           }

        System.out.println(Math.abs(2-a)+Math.abs(2-b));

    }
}
