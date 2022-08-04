package Assisted_Practice4;

// import java.*;
import java.util.Scanner;
public class BubbleSort {
    public static int[] sortArray(int[] nums){
        bubbleSort(nums);
        return nums;
    }
    public static void swap(int nums[],int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]  = temp;
    }
    public static void bubbleSort(int[] ary){
        int n = ary.length;
        for(int i = 0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(ary[j] < ary[i]){
                    swap(ary,i, j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]ary = new int[n];
        for(int i=0; i<n; i++){
            ary[i] = scn.nextInt();
        }
        System.out.println("-----------Sorted----------");
        int [] a = sortArray(ary);
        for(int j=0; j<a.length; j++){
            System.out.println(a[j]);
        } 
        scn.close();
    }
}