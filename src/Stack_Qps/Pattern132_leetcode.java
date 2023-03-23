package Stack_Qps;

import java.util.Stack;

public class Pattern132_leetcode {
    public static void main(String[] args) {
        int []arr = {3,1,4,2};
        System.out.println(pattern(arr));
    }
    public static boolean pattern(int []arr){
        int min[] = new int[arr.length];
        min[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            min[i] = Math.min(min[i-1],arr[i]);
        }
        Stack<Integer> st = new Stack<>();
        for(int j= arr.length-1;j>=0;j--){
            int ith = min[j];
            if(ith<arr[j]){
                while(!st.isEmpty() && arr[st.peek()]<=ith){
                    st.pop();
                }
                if(!st.isEmpty() && arr[st.peek()]<arr[j]){
                    return true;
                }
            }
            st.push(j);
        }
        return false;
    }
}
