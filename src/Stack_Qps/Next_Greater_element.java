package Stack_Qps;

import java.util.Stack;

public class Next_Greater_element {
    /*
    Given an array, print the Next Greater Element (NGE) for every element. The Next Greater
    Element for an element x is the first greater element on the right side of x in array.
    Elements for which no greater element exist, consider next greater element as -1.
    Sample Input
    2 //no of test cases
    4 //size of array 1
    11 13 21 3  //n spaces integer in an array
    5  //size of array 2
    11 9 13 21 3
    Sample Output
    11,13
    13,21
    21,-1
    3,-1
    11,13
    9,13
    13,21
    21,-1
    3,-1
    Explanation
    For the first testcase , the next greater element for 11 is 13 ,
    for 13 its 21 and 21 being the largest element of the array does not have a next greater
    element. Hence we print -1 for 21. 3 is the last element of the array and does not have any
    greater element on its right. Hence we print -1 for it as well.
     */

    public static void main(String[] args) {
        int []arr = {11, 3, 23, 9, 15};
        NGE(arr);
    }
    public static void NGE(int []arr){
        int []nge = new int[arr.length]; //is array mai hum arr ke next greater element ko rkhenge
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while (!st.isEmpty() && arr[i]>arr[st.peek()]){
                int ii = st.pop();
                nge[ii]=arr[i];
            }
            st.push(i); //pushing index of that element if no next greater element is possible
            // for that element
        }
        //ab jo stack mai rah jayenge toh iska mtlb unka nge exist nhi krta hai
        while (!st.isEmpty()){
            int ii=st.pop();
            nge[ii]=-1;
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+", "+nge[i]);
        }
    }
}
