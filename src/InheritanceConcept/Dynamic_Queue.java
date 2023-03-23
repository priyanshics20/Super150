package InheritanceConcept;
import Implementation_Stack.queue;

import javax.swing.plaf.PanelUI;

public class Dynamic_Queue extends queue{
    @Override
    public void enqueue(int item) throws Exception {
        if(isFull()){
            int[] ar = new int[2*arr.length];
            for(int i=0;i<arr.length;i++){
                int idx = (this.front+i)% arr.length;
                ar[i]=arr[idx];
            }
            this.arr=ar;
            this.front=0;
        }
        super.enqueue(item);

    }

    //JAVA MAI HAR CLASS KA PARENT CLASS OBJECT CLASS HOTA HAI
}


