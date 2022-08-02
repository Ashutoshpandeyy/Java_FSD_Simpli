import java.util.*;

public class LongIncrSub {
    public static int longestSubsq(int[] ary, int n) {
        int res = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (ary[j] < ary[i]) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                }
            }
            arr[i] = max + 1;
            if (arr[i] > max) {
                res = arr[i];
            }

        }

        return res;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("How many digit you want to insert in array : ");
        int n = scn.nextInt();
        int[] ary = new int[n];
        for(int i =0; i<ary.length; i++){
        ary[i] = scn.nextInt();
        }
        // int[] ary = { 7, 7, 7, 7 };
        // int n = ary.length;
        int l = longestSubsq(ary, n);
        System.out.println("Longest Increasing Subsequence is : " + l);
        scn.close();
    }
}
