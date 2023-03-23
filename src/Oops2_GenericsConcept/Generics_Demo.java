package Oops2_GenericsConcept;
import java.util.*;
public class Generics_Demo<T> {
//    hum do type ke bhi primitive function use kar skte uske liye humko <T,P> ese , ke bad ek
    //or likhna padega
    T x;
    T y;

    public static void main(String[] args) {
        Generics_Demo<Integer> g = new Generics_Demo();
        g.x=10;

        //T kisi bhi type ka ho sakta hai
        Generics_Demo<String> ge = new Generics_Demo<>();
        ge.x="prachi";

    }

}
