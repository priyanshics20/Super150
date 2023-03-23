package Oops2;

public class Final_Demo {
    //using final keyword with variable
    //variable value become constant if we use final , we can not change value then
    final int val = 80;

    public void fun(){
        //can't update
//        val = val+30;
        System.out.println(val);
    }

    //if we use final keyword with function/method then we can not override that function

    //if we use final keyword with class then that class can not be inherited

}
