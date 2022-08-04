package Assisted_Practice4;

import java.util.Scanner;

public class LinearSearch {
    public static void search(int[] ary, int n) {
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] == n) {
                System.out.println("Your element is found on this index : " + i);
                break;
            } else {
                continue;
            }
        }
     
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value Which You want to perform : ");
        int n = scn.nextInt();
        int[] ary = { 1, 3, 5, 6, 8, 9 };
        search(ary, n);
        scn.close();
    }
}
