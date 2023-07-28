package Striver_CP_SHEET;
import java.util.*;
public class Fox_And_Snake {
    public static void main(String[] args)
    {


        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();

        ArrayList<String > hash = new ArrayList<>();
        ArrayList<String> front_hash = new ArrayList<>();
        ArrayList<String> rear_hash = new ArrayList<>();

        hash.add("#");
        front_hash.add("#");

        for(int i=1;i<m;i++)
        {
            front_hash.add(i,".");
            hash.add("#");
        }

        for(int i=0;i<m-1;i++)
        {
            rear_hash.add(i,".");
        }
        rear_hash.add("#");

        boolean c = true;

            for(int i=0;i<n ;i++)
            {
                if(i%2==0)
                {
                    for(int j=0 ; j<hash.size() ;j++){ System.out.print(hash.get(j));}
                }
                else if(c)
                {
                    for(int j=0 ; j<rear_hash.size() ;j++){ System.out.print(rear_hash.get(j));}
                    c=false;
                }
                else if(!c)
                {
                    for(int j=0 ; j<front_hash.size() ;j++){ System.out.print(front_hash.get(j));}
                    c=true;
                }
                System.out.println();
            }

    }
}
