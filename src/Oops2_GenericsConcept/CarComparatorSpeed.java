package Oops2_GenericsConcept;

import java.util.Comparator;

public class CarComparatorSpeed implements Comparator<Cars> {

    @Override
    public int compare(Cars o1, Cars o2) {
        //o1=this, o2=other
         return o1.speed-o2.speed;
    }
    
}
