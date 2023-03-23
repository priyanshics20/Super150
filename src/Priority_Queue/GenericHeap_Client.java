package Priority_Queue;

public class GenericHeap_Client {
    public static void main(String[] args) {
        Generic_Heap<Car_genericHeap> gp = new Generic_Heap<>();
        gp.add(new Car_genericHeap(200,10,"White"));
        gp.add(new Car_genericHeap(1000,20,"Black"));
        gp.add(new Car_genericHeap(345,3,"Yellow"));
        gp.add(new Car_genericHeap(34,89,"Grey"));
        gp.add(new Car_genericHeap(8907,6,"Red"));
        gp.display();
        System.out.println(gp.remove());
        gp.display();
    }
}
