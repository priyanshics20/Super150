package Oops2_GenericsConcept;

import java.util.Comparator;
import java.util.Objects;

//comparable comparator
public class Cars { //implements Comparable<Cars> {
    int price;
    int speed;
    String color;

    public Cars() {

    }

    public Cars(int price, int speed, String color) {
        this.price = price;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString(){
        return  "P: " + this.price + " S: "+this.speed + " C: "+this.color;
    }

//    @Override
//    public int compareTo(Cars o) {
//        //speed in increasing order jitni jyada utni achhi
////        return this.speed-o.speed;
//
//        //price in decreasing order jitna kam price utna achha
//        return o.price-this.price;
//
////        return this.color.compareTo(o.color);
//    }

}
