package Implementation_Stack;

public class queue {
    protected int[] arr;
    protected int front=0;
    protected int size=0;
    public queue(){
        this.arr = new int[5];
    }
    public queue(int cap){
        this.arr = new int[cap];
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public boolean isFull(){
        return this.size==this.arr.length;
    }
    public int size(){
        return this.size;
    }
    public void enqueue(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full");
        }
        int i=(this.size+this.front)%this.arr.length;
        this.arr[i]=item;
        size++;
    }
    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int rv=this.arr[this.front];
        this.front=(this.front+1)%this.arr.length;
        this.size--;
        return rv;
    }
    public int getFront() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        return this.arr[this.front];
    }

    public void display(){
        for (int i=0;i<this.size;i++){
            int idx=(this.front+i)%this.arr.length;
            System.out.print(this.arr[idx]+" ");
        }
        System.out.println();
    }

}
