package Stack_Qps;

import java.util.Stack;

public class Stock_Span {
    /*
    The stock span problem is a financial problem where we have a series of N daily price quotes
    for a stock and we need to calculate span of stock’s price for all N days.
    You are given an array of length N, where ith element of array denotes the price of a stock on
    ith. Find the span of stock's price on ith day, for every 1<=i<=N.
    A span of a stock's price on a given day, i, is the maximum number of consecutive days before
    the (i+1)th day, for which stock's price on these days is less than or equal to that on the
    ith day.
    Sample Input
    5
    30
    35
    40
    38
    35
    Sample Output
    1 2 3 1 1 END
    Explanation
    For the given case
    for day1 stock span =1
    for day2 stock span =2 (as 35>30 so both days are included in it)
    for day3 stock span =3 (as 40>35 so 2+1=3)
    for day4 stock span =1 (as 38<40 so only that day is included)
    for day5 stock span =1 (as 35<38 so only that day is included)
    hence output is 1 2 3 1 1 END
     */
    public static void main(String[] args) {
        int arr[]={9,11,23,15,38,42,37};
        span_cal(arr);
    }
    public static void span_cal(int[] arr){
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i]=i+1;
            }else {
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+", "+span[i]);
        }
    }
}
