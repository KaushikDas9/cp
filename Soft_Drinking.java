package Striver_CP_SHEET;

import java.util.Scanner;

public class Soft_Drinking {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int l=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        int p=scan.nextInt();
        int nl=scan.nextInt();
        int np=scan.nextInt();

        int drink = (k*l)/nl;
        int slice= (c*d);
        int salt = (p/np);

        System.out.println((Math.min(drink,Math.min(slice,salt)))/n);
    }
}
