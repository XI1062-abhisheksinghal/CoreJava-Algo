package com.mckc.array.practice;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {1,2,5,9,23,8,6};
        //QuickSort to sort the numbers
        quickSort(arr,0,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] nums, int low, int high){

        int i = low-1;
        int pivot = nums[high];
        for(int j=0;j<=high-1;j++){

            if(nums[j]<pivot){
                i++;
                swap(nums,i,j);
            }
        }

        swap(nums,i+1,high);
        return i+1;
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
