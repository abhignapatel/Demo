public class Stack {
         private int arr[];
         private int top;
         private int capacity;

         //creating stack
         Stack(int size){
             arr = new int[size];
             capacity=size;
             top = -1;
         }
         public void push(int x){
             if(isFull()){
                 System.out.println("stack full");
                 System.exit(1);
             }
             System.out.println(""+x);
             arr[++top]=x;
         }

    private boolean isFull() {
             return top== capacity-1;
    }

    public  void printstack(){
             for (int i=0;i<=top;i++){
                 System.out.println(arr[i]);
             }
    }
}
