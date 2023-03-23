package Implementation_Stack;

public class stack {
    //public ka use kese bhi kr skte hai
    //private sirf same package mai ho skta lekin inherit kabhi nahi ho skta
    //default ko hum inherit nahi kr skte , same package mai kar skte
    //protected ko inherit kar skte hai
    protected int[] arr;
    protected int top;
    public stack(){
        this.arr = new int[5];
        this.top=-1;
    }
    public stack(int cap){
        this.arr = new int[cap];
        this.top=-1;
    }
    public boolean isEmpty(){
        return this.top==-1;
    }
    public boolean isFull(){
        return this.top==this.arr.length-1;
    }
    public void push(int item) throws Exception{
        if(isFull()){
//            System.out.println("overflow");
            throw new Exception("sun be pgl hai kya ?? stack full hogya🤣");
        }
        this.arr[++this.top]=item;
    }
    public int pop() throws Exception{
        if(isEmpty()){
//           return -1;
            throw new Exception("sun be pgl hai kya ?? stack Empty hogya🤣");
        }
       return this.arr[this.top--];
    }
    public int peek() throws Exception{
        if(isEmpty()) {
//            return -1;
            throw new Exception("sun be pgl hai kya ?? stack Empty hogya🤣");
        }
        return this.arr[this.top];
    }
    public int size(){
        return this.top+1;
    }
    public void display(){
        for (int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
