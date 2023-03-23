package InheritanceConcept;

public class Client {
    public static void main(String[] args) {
        //Case1 -- reference parent ka or instance bhi parent ka
//        Parent obj = new Parent();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        obj.fun();
//        obj.fun1();


        //Case 2 -- reference parent ka and instance child ka
        //Compiler humesha LHS dekhta hai
        //JVM humesha RHS dekhta hai
        //obj p type ka hai isliye d2 mai error show ho rahi
        //jab hum code likhte hai toh compiler ke hath mai pura control rhta hai
        //jab hum initialize kar rahe the parent obj = toh ye compile time hota hai or
        //compiler check krta hai lhs side isliye hum Parent ke sare method access kar paa rahe
        // pr Child ke nahi kyuki bo rhs side hai.

//        Parent obj = new Child();
//        System.out.println(obj.d);//o/p - 1
//        System.out.println(obj.d1);//o/p - 10
//        //not possible to access d2 as it belongs to child class
////        System.out.println(obj.d2);
//        //typecast obj
//        System.out.println(((Child) (obj)).d2);
//        System.out.println(((Child)(obj)).d);

        //jo functions/method hote hai bo new bale ka hi chlta hai
//        obj.fun(); //fun in C o/p ayega kyuki new child() hai
//        obj.fun1(); //phle child class mai check kia vhan nahi mila toh parent mai mila or o/p aya
//        ((Child) (obj)).fun2(); //humne typecaste isliye kia kyuki compilation error aajati
        //or obj.fun() mai type caste isliye nahi kia kyuki bo Parent class mai tha toh
        // compilation time pr error nahi show ki lekin runtime pr Child class ka fun ka o/p aya


        //Case 3
        //this type of inheritance not allowed in any langugage
//        Child obj1 = new Parent();

//        Case 4
        Child obj = new Child();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        System.out.println(obj.d2);
        System.out.println(((Parent)(obj)).d);
        obj.fun();
        obj.fun2();
        obj.fun1();
    }
}
