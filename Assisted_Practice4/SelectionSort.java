package Assisted_Practice4;

import java.util.*;
public class SelectionSort {
    public static int[] arraySort(int[] ary){
        selectionSort(ary);
        return ary;
    }

    public static void swap(int[] ary, int i, int j){
        int temp = ary[i];
        ary[i] = ary[j];
        ary[j] = temp; 
    }
    public static void selectionSort(int[]ary){
        int n = ary.length;
        for(int i =1; i<n; i++){
            int minIdx = i-1;
            for(int j=i; j<n; j++){
                if(ary[minIdx] > ary[j]){
                    minIdx = j;
                }
            }
            swap(ary, minIdx, i-1);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] ary = new int[n];
        for(int i =0; i<ary.length; i++){
            ary[i] = scn.nextInt();
        }
        scn.close();
        System.out.println("---------------------Sorted----------------------------");
        int [] a = arraySort(ary);
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        } 
    }
   

}