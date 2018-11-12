package com.company;

import java.util.Scanner;

public class Main {

    public static Integer[] a=new Integer[6];
    public static int i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 6; i++) {
            System.out.println("a["+i+"]=");
            a[i] = sc.nextInt();
        }
        for (i = 0; i < 6; i++)
            System.out.print(a[i]+" ");
    }
}
