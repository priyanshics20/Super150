package InheritanceConcept;

import java.util.ArrayList;

public class Student {
    //JAVA MAI HAR CLASS KA PARENT CLASS OBJECT CLASS HOTA HAI
    String name;
    int age;
    static int count = 0;

    public Student() {
        count++;
    }

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
        count++;

    }


    //    @Override
//    public String toString(){
//        ye toString() method object class ka hai is wajah se humko address print hota hai
    //agr humko kuch or print krana hai toh ise is trh override krna padega or fir hum kuch bhi
    //print kra skte hai
//    }
    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    public static void Hello() {
        System.out.println(" Hey ");
    }

    static {
        System.out.println("In Static ");
    }

}
