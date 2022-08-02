import java.util.Arrays;

import java.util.Scanner;

public class FourthSmallest {
    public static int kthLargestEl(Integer[] ary, int k) {
        Arrays.sort(ary);

        return ary[k - 1];
    }

    public static void display(Integer[] ary) {
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("How many element you want to insert in array :  ");
        int n = scn.nextInt();
        Integer[] ary = new Integer[n];
        System.out.println("Enter the Elements : ");
        for (int i = 0; i < n; i++) {
            ary[i] = scn.nextInt();
        }
        System.out.println(" Your Arrays is : ");
        display(ary);
        System.out.println();

        System.out.print("Which typee of largest number you wana to find : ");
        int l = scn.nextInt();
        int k = kthLargestEl(ary, l);
        System.out.println();
        System.out.println("Your largeset Number is : " + k);
    }

}
