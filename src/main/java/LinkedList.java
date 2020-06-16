public class LinkedList {

    private Node head;
    private Node last;



    public LinkedList(int data) {
        insertAtEnd(data);
    }

    public void insertAtBeginning(int data) {
        Node new_node = new Node(data);
//
        if (head == null) {
            head = new_node;
            last = head;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }

    public void insertAtEnd(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            last = head;
        } else {
            last.next = new_node;
            last = new_node;
        }
    }

   public int getMiddle( int k){
//
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null&& slow!=null) {

          for (int i = k ; i <= k;i++) {

                fast = fast.next.next;
                slow = slow.next;

            }
        }
        return slow.data;

   }

   public int addMiddle(int data){
        Node new_node = new Node(data);

       Node fast = head.next;
       Node slow = head;

       while (fast != null && fast.next != null) {

           fast = fast.next.next;
           slow = slow.next;

       }
            Node temp = slow.next;
            slow.next = new_node;
            new_node.next = temp;

       return slow.data;
    }
    public void   deleteNode(){
        Node fast = head;

        while (fast!= null&&fast.next!=null) {
            System.out.println(fast.data);
             fast = fast.next.next;

        }
        if (fast!=null){
            System.out.println(fast.data);
        }
    }

   public void print(){
        Node node = head;
        while (node!=null){
            System.out.println(node.data +" ");
            node = node.next;
        }

    }
}
