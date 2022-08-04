package Assisted_Practice4;

import java.util.Scanner;
public class InsertionSort {
    public static int[] sortAry(int[] ary){
        insertionSort(ary);
        return ary;
    }
    public static void swap(int ary[], int i, int j){
        int temp = ary[i];
        ary[i] = ary[j];
        ary[j] = temp;
    }
    public static void insertionSort(int ary[]){
        int n = ary.length;
        for(int i =1; i<n; i++){
            for(int idx =i; idx>0; idx-- ){
                if(ary[idx] < ary[idx-1]){
                    swap(ary, idx, idx-1);
                }else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn  =  new Scanner(System.in);
        int n =  scn.nextInt();
        int ary[] = new int[n];
        for(int i =0; i<ary.length; i++){
            ary[i] = scn.nextInt();
        }
        scn.close();

        System.out.println("--------Sorted--------------");
        
        int nums[] = sortAry(ary);
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}