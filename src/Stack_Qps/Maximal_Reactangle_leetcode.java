package Stack_Qps;

import java.util.Stack;

public class Maximal_Reactangle_leetcode {
    public static void main(String[] args) {
        int [][]matrix = {{1,0,1,0,0},
                          {1,0,1,1,1},
                          {1,1,1,1,1},
                          {1,0,0,1,0}};
        int [][] arr = new int[matrix.length][matrix[0].length];
        int ans=0;
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j< arr[0].length;j++){
                if(i==arr.length-1){
                    arr[i][j]=matrix[i][j];
                }else{
                    arr[i][j]=matrix[i][j]==1? arr[i+1][j]+1:0;
                }
            }
            ans = Math.max(ans,Area(arr[i]));
        }
        System.out.println(ans);
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
    public static int largest(int []arr){
        int ans=0;
        Stack<Integer> st  = new Stack<>();
        int []left = new int[arr.length];
        int []right = new int[arr.length];
        //        int []arr = {2,3,5,4,6,1,7};
        //left smaller
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            left[i] = st.isEmpty()? -1:st.peek();
            st.push(i);
        }
        st.clear();
//      right smaller
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            right[i] = st.isEmpty()? arr.length:st.peek();
            st.push(i);
        }
        for(int i=0;i<arr.length;i++){
            ans = Math.max(ans,arr[i]*(right[i]-left[i]-1));
        }
        return ans;
    }
}
