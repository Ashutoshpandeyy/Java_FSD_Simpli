import java.io.*;
import java.util.*;

public class MultiplyOfTwoMat {
    public static void input(int[][] ary, Scanner scn) {
        for (int r = 0; r < ary.length; r++) {
            for (int c = 0; c < ary[0].length; c++) {
                ary[r][c] = scn.nextInt();
            }
        }
    }

    public static void display(int[][] prodOfAry) {
        for (int r = 0; r < prodOfAry.length; r++) {
            for (int c = 0; c < prodOfAry[0].length; c++) {
                System.out.print(prodOfAry[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiOfAry(int[][] ary1, int[][] ary2) {
        int r = ary1.length, c1 = ary1[0].length;
        int r2 = ary2.length, c2 = ary2[0].length;

        int[][] prod = null;
        if (c1 == r2) {
            prod = new int[r][c2];
            for (int i = 0; i < prod.length; i++) {
                for (int j = 0; j < prod[0].length; j++) {
                    for (int k = 0; k < ary1[0].length; k++) {
                        prod[i][j] += ary1[i][k] * ary2[k][j];
                    }
                }
            }
            return prod;
        } else {
            System.out.println("Invalid input");
        }
        return prod;

    }

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int row1 = scn.nextInt();
        int col1 = scn.nextInt();
        int[][] ary1 = new int[row1][col1]; // create a 2d Array
        input(ary1, scn);

        int row2 = scn.nextInt();
        int col2 = scn.nextInt();
        int[][] ary2 = new int[row2][col2]; // create a 2d Array
        input(ary2, scn);

        int res[][] = multiOfAry(ary1, ary2);
        if (res != null) {
            display(res);
        }
    }
}