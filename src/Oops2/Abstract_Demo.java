package Oops2;

public abstract class Abstract_Demo {

    //abstract class is usually used for data hiding

    //if we have any abstract method then we have to make class abstract (necessary)
    //in abstract class non-abstract method can be there

    //if we make abstract class that it is not necessary that we have abstract method
    //it just shows that it can have abstract method

    //abstract method -->
    //this is abstract method if we put { } then it will not remain abstract even if we doesn't
    //write anything inside curly braces
    //abstract method are those where we didn't give body to that method
    public abstract void fun();

    //non-abstract method or simply we say method -
    public void funn(){

    }

    //we can't make object of abstract class because in abstract class there is possibly abstract
    //method and abstract method does not have body so we can't access the method thst's why
    // can not make obect of abstract class

    //we can not achieve multiple inheritance in abstract class
    //in interface we can achieve multiple inheritance

}
