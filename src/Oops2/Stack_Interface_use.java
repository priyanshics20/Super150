package Oops2;

public class Stack_Interface_use implements stackInterface{

    //we implements interface class in another class
    //we extends class in another class
    //one interface can extends another interface (it can not implement intercface)
    //here because in interface we can not give body to method so we can not implement body
    //of method in another interface that's why we extends interface to another interface

    /*
    we can not change the return type of method joki interface class mai bana hai
    for ex- let A ne stack implement kia or B ne uska use kia A ne return type pop ka boolean
    rakha toh jab B ne use kia .. after sometime A ko chull hui or usne return type change kar
    dia boolean to int toh B ne jo A ka code use kia tha toh ab bo boolean se kiz pr jab A ne
    return type int kar dia toh uska code bekar hojayega kyuki bo boolean ke according banaya
    hai toh isliye hum interface ka use krte hai jisse ki sirf hum body change kar skte hai
    return type nahi or A body glt likh nahi skta vrna uski job jaa skti hai kyuki glt
    implement kar nahi skte stack ka ya kisi ka bhi
     */

    @Override
    public void push() {

    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    //display() method is in DSAInterface as well as DynamicStackInterface but here only
    // one display method is override kyuki body toh humne isme hi di hai
    //interface class mai body nahi di toh bo conflict nahi kar rahe
    //but if we change the return type of any display then ye code glt hojata esa hum nahi
    //kar skte

    @Override
    public void display() {
        System.out.println("Interface Body given in class Stack_Interface_use");
    }

    @Override
    public void fun() {

    }

    @Override
    public boolean isFull() {
        return false;
    }
}
