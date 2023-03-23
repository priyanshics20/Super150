package Sorting_Algorithms;

public class selection_sort {
    public static void main(String[] args) {
        int arr[] = {45, 23 , 67, 13 , 9 , 15};
        int n =arr.length;
        for(int i=0;i<n-1;i++){
            int small=i;
            for(int j=i+1; j<n;j++) {
                if (arr[j] < arr[small]) {
                    small = j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }

        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
