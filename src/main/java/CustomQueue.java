import java.util.Arrays;

public class CustomQueue {
//   private int front, rear;
//    private  int[] array;
    Node front,rear;


    CustomQueue(int capacity) throws Exception {

        if (capacity<=0){
           throw new Exception("capacity should not be zero and less than zero ");
        }
       else{
////            array = new int[capacity];
//            front = rear = null;
       }

    }
    CustomQueue(){
//        array = new int[3];
//        front = rear = 0;
    }

    public void enQeue(int data) {
         Node temp = new Node(data);

//        array = Arrays.copyOf(array, array.length * 2);
//        array[rear] = element;
//        rear++;
        if (rear==null){
            front=rear=temp;
        }
       rear.next=temp;
        rear=temp;


    }

    int deQueue() {
//        if(rear!=front){
//
//            int data = array[front];
//            front++;
//            return data;
//
//        }
        if (front!=null){
            int data = front.data;
            front = front.next;
            return data;
        }
        System.out.println("queue is empty");
        return 0;

    }



}
