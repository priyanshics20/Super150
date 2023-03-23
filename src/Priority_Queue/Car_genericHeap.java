package Priority_Queue;

public class Car_genericHeap implements Comparable<Car_genericHeap>{
    int price;
    int speed;
    String color;
    public Car_genericHeap(){

    }
    public Car_genericHeap(int price , int speed , String color){
        this.price=price;
        this.speed=speed;
        this.color=color;
    }
    @Override
    public String toString(){
        return "P: "+this.price+" S: "+this.speed+" C: "+this.color;
    }
    @Override
    public int compareTo(Car_genericHeap o){
//        return this.price - o.price;
//        return o.price-this.price;
        return this.color.compareTo(o.color);
    }

}
