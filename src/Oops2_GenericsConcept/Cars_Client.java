package Oops2_GenericsConcept;

import java.util.Comparator;

//comparable comparator
public class Cars_Client {

    public static void main(String[] args) {
//            Array Initialization
//    int[] arr = new int[7];

//    Car initialization
        Cars[] car = new Cars[5];
        car[0] = new Cars(200, 10, "White");
        car[1] = new Cars(1000, 20, "Black");
        car[2] = new Cars(345, 3, "Yellow");
        car[3] = new Cars(34, 89, "Grey");
        car[4] = new Cars(8907, 6, "Red");

        //Object class ka to string method
//        ye toString() method mene idhr copy kia hai Object class se
//        public String toString() {
//            return getClass().getName() + "@" + Integer.toHexString(hashCode());
//        }
//        iski bjh se humare pas ese hexcode mai address aa raha toh humko is toString
//        method ko overrride karna padega in class Cars
//        sort(car,new CarComparatorSpeed());
        sort(car,new CarComparatorPrice());
        sort(car,new CarComparatorColor());
        display(car);
    }

    public static void display(Cars[] car){
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
    }

    //other(90) - this(80) >0 then swap then it is in deceasing order
    //90-80 >0 toh swap 90->80

    //T extends Comparable<T> = bound set
//    public static<T extends Comparable<T>> void sort(T []arr){
//        //sorting in increasing order
//        //arr[i]= this (90)
//        //arr[i+1] = other (80)
//        //this-other>0 then swap , ex- 90-80 >0 swap
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j< arr.length-i-1;j++){
//                if(arr[j].compareTo(arr[i+1])>0){
//                    T temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//    }

    public static<T> void sort(T []arr, Comparator<T> camp){
        //sorting in increasing order
        //arr[i]= this (90)
        //arr[i+1] = other (80)
        //this-other>0 then swap , ex- 90-80 >0 swap
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(camp.compare(arr[j],arr[i+1])>0){
                    T temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
