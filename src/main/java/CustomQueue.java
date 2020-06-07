import java.util.Arrays;

public class CustomQueue {
   private int front, rear;
    private  int[] array;



    CustomQueue(int capacity) throws Exception {

        if (capacity<=0){
           throw new Exception("capacity should not be zero and less than zero ");
        }else{
            array = new int[capacity];
            front = rear = 0;
        }

    }
    CustomQueue(){
        array = new int[3];
        front = rear = 0;
    }

    public void enQeue(int element) {


        array = Arrays.copyOf(array, array.length * 2);
        array[rear] = element;
        rear++;

    }

    int deQueue() {
        if(rear!=front){

            int data = array[front];
            front++;
            return data;

        }
        System.out.println("queue is empty");
        return 0;

    }



}
