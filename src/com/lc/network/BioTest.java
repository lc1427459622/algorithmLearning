package com.lc.network;

import java.util.Scanner;

public class BioTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(int j =1;j<=i;j++){
            String a,b;
            a = sc.next();
            b = sc.next();
            int cd = a.length() - b.length() > 0?a.length() :b.length();
            int[] aint = new int[cd];
            int[] bint = new int[cd];
            for (int i1 = 0;i1<a.length();i1 ++){
                aint[a.length()-1-i1] = Integer.parseInt(a.substring(i1,i1+1));
            }

        }
    }
}
