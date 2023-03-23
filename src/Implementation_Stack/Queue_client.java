package Implementation_Stack;

public class Queue_client {
    public static void main(String[] args) throws Exception{
        queue qq = new queue();
        qq.enqueue(10);
        qq.enqueue(20);
        qq.enqueue(30);
        qq.enqueue(40);
//        qq.enqueue(50);
        qq.dequeue();//10
        qq.dequeue();//20
        qq.display();
        qq.enqueue(60);
        qq.enqueue(70);
        qq.enqueue(80);
        qq.display();
    }

}
