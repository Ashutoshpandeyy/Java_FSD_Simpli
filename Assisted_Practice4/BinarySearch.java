package Assisted_Practice4;

import java.util.*;

public class BinarySearch{

public static void main(String[] args) throws Exception {
    // write your code here\
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[] ary = new int[n];
    for(int i=0; i<n;i++)
    {
        ary[i]=scn.nextInt();
    }

    int data = scn.nextInt();
    int l=0;
    int h = n-1;
    int ceil = 0;
    int floor = 0;

    while(l<=h){
        int mid = (l+h)/2;
        if(data<ary[mid]){
            h = mid-1;
            ceil = ary[mid];
        }else if(data>ary[mid]){
            l = mid+1;
            floor = ary[mid];
        }else{
            ceil = ary[mid];
            floor= ary[mid];
            break;
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
    scn.close();

 }

}