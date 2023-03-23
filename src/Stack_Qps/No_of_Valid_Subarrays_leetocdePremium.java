package Stack_Qps;

import java.util.Stack;

public class No_of_Valid_Subarrays_leetocdePremium {
    /*
    Given an array A of integers, return the number of non-empty continuous subarrays that
    satisfy the following condition:
    The leftmost element of the subarray is not larger than other elements in the subarray.

    Input: [1,4,2,5,3]
    Output: 11
    Explanation: There are 11 valid subarrays:
    [1],[4],[2],[5],[3],[1,4],[2,5],[1,4,2],[2,5,3],[1,4,2,5],[1,4,2,5,3].

    Input: [3,2,1]
    Output: 3
    Explanation: The 3 valid subarrays are: [3],[2],[1].

    Input: [2,2,2]
    Output: 6
    Explanation: There are 6 valid subarrays: [2],[2],[2],[2,2],[2,2],[2,2,2].
 */
    public static void main(String[] args) {
        int []arr = {3,2,11,4,5,7};
//        System.out.println(bruteforce(arr));
        System.out.println(validSubarrays(arr));
    }

    public static int bruteforce(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            int j;
            for(j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    flag=true;
                    break;
                }
            }
            if(flag){
                count+=j-i;
            }else{
                count+=arr.length-i;
            }
        }
        return count;
    }

    //optimised code
    public static int validSubarrays(int []arr){
        int ans=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while (!st.isEmpty() && arr[i]<arr[st.peek()]){
                st.pop();
            }
            st.push(i);
            ans+=st.size();
        }
        return ans;
    }
}
