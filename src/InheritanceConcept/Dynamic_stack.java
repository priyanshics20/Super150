package InheritanceConcept;
import Implementation_Stack.stack;
public class Dynamic_stack extends stack{
    @Override
    public void push(int item) throws Exception{
        if(this.isFull()){
            //super.arr.length esa isliye kia kyuki super se hum parent bale array ko use kr rahe
            // kyuki yhan pr arr hai or parent mai bhi same name hai toh humko us parent bale arr ko
            //use krne ke liye super keyword ka use krna padega
            int []arr = new int[2*super.arr.length];
            for (int i=0;i<this.arr.length;i++){
                arr[i]=super.arr[i];
            }
            this.arr = arr;
        }
        //calling parent class method push
        //jab same name ke variable ya method ho parent or child class mai toh parent ke method
        // ya variable ko call krne ke liye super keyword ka use karenge
        super.push(item);
    }
}
