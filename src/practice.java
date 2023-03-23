import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        linear_search(arr, n , 8);
//        System.out.println(binary_Search(arr, n, 7));
    }

    public static void linear_search(int arr[], int n, int search){
        boolean found = false;
        for(int i=0;i<n;i++){
            if(arr[i]==search){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("element found");
        }
        else{
            System.out.println("Not found");
        }
    }

    public static int binary_Search(int []arr , int n, int search){
        int si=0;
        int ei=n-1;
        while (si<=ei){
            int mid = (ei-si)+si/2;
            if(arr[mid] == search){
                return mid;
            }else if(arr[mid]>search)
            {
                ei=mid-1;
            }else{
                si=mid+1;
            }
        }
        return -1;
    }

}