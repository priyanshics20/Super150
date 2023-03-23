package Sorting_Algorithms;

public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[] = {45, 23 , 67, 13 , 9 , 15};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }
}
