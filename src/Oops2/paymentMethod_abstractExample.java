package Oops2;

public class paymentMethod_abstractExample extends BankAccount_abstractExample {

    //unimplemented method of bankaccount class
    //here we will give body of unimplemented method
    @Override
    public boolean payment() {
        return false;
    }

    //now we can make object od child class (paymentMethod) and use every method of both class
    //abstract method as well as non-abstract method
}
