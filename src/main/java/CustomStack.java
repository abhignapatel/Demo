import java.util.Arrays;

public class CustomStack {
        private int[] array;
    private int i;
//    Node head;


    CustomStack(int capacity) throws Exception {
        if (capacity <= 0) {
            throw new Exception("capacity should not be zero and less than zero");

        }
        array = new int[capacity];
        i = 0; //is empty

    }

    public void push(int data) {
        Node temp = new Node(data);
        if (i == array.length) {

            array = Arrays.copyOf(array, array.length * 2);

        }

//        temp.next = head;
//        head = temp;
        array[i] = data;
        i++;


    }

    public int pop(){
//        int data = 0;
//        if (head != null) {
//            data= head.data;
//            head = head.next;
////            i--;
////            return array[i];
//            return data;
//
//        }
        if (i>0){
            i--;
            return array[i];
        }
        System.out.println("stack is empty");
        return  -1;
    }
}