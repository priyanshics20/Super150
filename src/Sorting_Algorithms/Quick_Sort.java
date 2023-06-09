package Sorting_Algorithms;

import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int []arr = {3 ,6, 2, 1, 5};
//        int n=arr.length;
        int n=sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        quickSort(arr,0,n-1);
        for (int i=0; i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int partititon(int []arr, int low, int high){
        int pivot = arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i; //pivot index
    }

    public static void quickSort(int []arr, int low, int high){
        if(low<high) {
            int pidx = partititon(arr, low, high);

            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx+1, high);

        }
    }
}
