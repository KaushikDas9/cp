package Striver_CP_SHEET;

import java.util.HashMap;
import java.util.Scanner;

public class Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<String,Integer> store = new HashMap<String,Integer>();
        store.put("Tetrahedron",4);
        store.put("Cube",6);
        store.put("Octahedron",8);
        store.put("Dodecahedron",12);
        store.put("Icosahedron",20);
        int ans=0;
        for(int i = 0; i < n; i++)
        {
            String temp = scan.next();
            ans+=store.get(temp);
        }
        System.out.println(ans);

    }

}











