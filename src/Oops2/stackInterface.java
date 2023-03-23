package Oops2;

public /*abstract (NOT MANDATORY to write abstract as it is default)*/ interface stackInterface extends DSAInterface,DynamicStackInterface{
    //interface inheriting another interface
    //multiple inheritance --> (extends DSAInterface,DynamicStackInterface)

    //by default interface class is also abstract
    //these are method and by default these method are public and abstract

    public void push();
    int pop();
    public int size();

    //in interface class if we declare variable then by default it is public static and final
    //public ka mtlb it is access modifier isko kahi par bhi access kar skte hai
    //static ka mtlb agr isko kisi class mai use karna hoga toh interface ke name se use
    // kar skte hai(see example in interface class DSAInterface)
    //final means constant value can not be updated after initialization

    //isko initialize krna jruri hai kyuki interface ka object nahi banta

    int val=90;

    //interface ke andar body nahi dete hai ye java 8 tak tha
    //ab interface mai body dete hai

    default void SayHey(){
        //default likhna is mandatory
        //or hum body de skte hai interface mai joki default ho or static ho
        //default nahi likha toh public mana jayega toh hum body nahi de payenge
        System.out.println("hey");
    }
    public static void Sayhey1(){
        System.out.println("hey");
    }

    //private method ko bhi body de skte hai
    private int fun1(){
        return 9;
    }

}
