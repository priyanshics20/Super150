package Oops2_GenericsConcept;
//Generics Concept
public class Function_Demo {
    public static void main(String[] args) {
//        int[] arr = {10,20,30,40,50};
        Integer[] arr = {10,20,30,40,50};
        display(arr);
        System.out.println();
        String arr1[] = {"ram","shyam","mohan","tejas"};
        display(arr1);

        //now if we make long type array then too we have to display and take long arr
        // in method to display
        //so we generalize it make function generic


    }

    //angular bracket mai T likh kar ye bta dia kia apne function ko generic banaya hai
    //T se mtlb kuvh bhi ho ksta hai Integer, String , Long
    //T ki jgh kuch bhi likh skte hai

    public static <T> void display(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

//    public static void display(String[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }
//
//    public static void display(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }

}
