package Assisted_Practice1;

//Writing a program in Java to verify implementation of arrays
public class ArrayUses {
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
        int[] ary={1,7,5,9,6,34}; // creating a Array
        System.out.println("findind the value of 0 index : "+ary[0]); // retrive valu form the array
        int sum = 0;
        //printing the each value of the array
        for(int k=0; k<ary.length; k++){
            System.out.println(ary[k]);
        }
        int l = ary.length; // length of the array
        System.out.println("Array length : "+ l);
        for(int i =0; i<l; i++){
            sum+=ary[i];
        }
        System.out.println("Sum is : " + sum);

        // sorting array
        System.out.println("---Array Sorting------");
        int [] a = sortArray(ary);
        for(int j=0; j<a.length; j++){
            System.out.println(a[j]);
        } 
        

    } 
    

}
