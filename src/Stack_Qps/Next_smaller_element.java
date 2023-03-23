package Stack_Qps;

import java.util.Stack;

public class Next_smaller_element {
    public static void main(String[] args) {
        int arr[]={4, 10, 5, 8, 20, 15, 3, 12};
        nse(arr);
    }
    public static void nse(int []arr){
        int []ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i< arr.length;i++){
            while (!st.isEmpty() && arr[i]<arr[st.peek()]){
                int ii=st.pop();
                ans[ii]=arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()){
            int ii=st.pop();
            ans[ii]=-1;
        }
        for(int i=0;i< arr.length;i++)
            System.out.println(arr[i]+", "+ans[i]);
    }
}
