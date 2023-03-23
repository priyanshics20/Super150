package Stack_Qps;

import java.util.Stack;

public class Largest_Rectangle_In_Histogram_Leetcode {
    public static void main(String[] args) {
//        int []arr = {2,3,5,4,6,1,7};
//        int []arr = {2,1,5,6,2,3};
        int []arr = {1,1};
//        int []arr = {2,4};
//        System.out.println(Area(arr));
        System.out.println(bruteforce(arr));
    }

    public static int bruteforce(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            //right smaller
            int rs=i+1;
            int j=i+1;
            for(;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    rs=j;
                    break;
                }
            }
            if(j==arr.length)
                rs= arr.length;
//            left smaller
            int ls=i-1;
            j=i-1;
            for(;j>=0;j--){
                if(arr[i]>arr[j]){
                    ls=j;
                    break;
                }
            }
            if(j==-1)
                ls=-1;
            ans=Math.max(ans,arr[i]*(rs-ls-1));
        }
        return ans;
    }
    public static int Area(int []arr){
        Stack<Integer> st = new Stack<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            while (!st.isEmpty() && arr[i]<arr[st.peek()]){
                int r = i;
                int h = arr[st.pop()];
                if(st.isEmpty()){
                    ans= Math.max(ans,h*r);
                }else{
                    int l= st.peek();
                    ans=Math.max(ans,h*(r-l-1));
                }
            }
            st.push(i);
        }
        int r=arr.length;
        while (!st.isEmpty()){
            int h = arr[st.pop()];
            if(st.isEmpty()){
                ans= Math.max(ans,h*r);
            }else{
                int l= st.peek();
                ans=Math.max(ans,h*(r-l-1));
            }
        }
        return ans;
    }

    //by using concept of rain water trapping
    public static int largestArea(int[] arr ){
        int n=arr.length;
        Stack<Integer> st = new Stack<>();
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        //left smaller
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            left[i]=st.isEmpty()? -1:st.peek();
            st.push(i);
        }
        st.clear();

        //right smaller
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            right[i]=st.isEmpty()? n:st.peek();
            st.push(i);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans = Math.max(ans,arr[i]*(right[i]-left[i]-1));
        }
        return ans;
    }
}
