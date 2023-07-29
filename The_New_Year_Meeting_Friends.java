package Striver_CP_SHEET;
import java.util.Scanner;
public class The_New_Year_Meeting_Friends {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int x3 = scan.nextInt();

        // Logic
        // (x2-x1) + (x3-x2) = total minimum distance
        // =) x2-x1+x3-x2 = total maximum distance
        // =) x3 - x1 = total minimum distance (here x3 is max distance ans x1 is min distance)

        System.out.println((Math.max(x1,Math.max(x2,x3)))-(Math.min(x1,Math.min(x2,x3))));
    }
}
