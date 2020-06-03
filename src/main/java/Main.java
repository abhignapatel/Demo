import org.omg.PortableInterceptor.INACTIVE;

import java.util.Stack;

public class Main {
//    static boolean test(int[] a, int key) {
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == key) {
//                return true;
//            }
//        }
//        return false;
//    }

  static   int check(Node head){
      int count =0;
        while (head!=null){
            count = count+1;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
//        int a[] = new int[]{1,2,3,4,5,5};
//        FindRepeat fr = new FindRepeat();
//        int b = fr.find(a,5);
//        System.out.println(b);

//        SumofArray sa = new SumofArray();
//        int a = sa.sum(new int[]{1,2,3,4,5});
//        System.out.println(a);

//        FindMaxValue findMax = new FindMaxValue();
//        int[] a = {-1,-2,-3};
//        int max = findMax.findMax(a);
//        System.out.println("max:"+max);

//        FindMin fn = new FindMin();
//         int b=fn.min(new int[]{3,4,5,1,2,6,7});
//           System.out.println("min value:"+b);

        /*HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","January");
        hashMap.put("2","february");
        hashMap.put("3","march");
        hashMap.put("4","april");
        hashMap.put("5","may");
        hashMap.put("6","june");
        hashMap.put("7","july");
        hashMap.put("8","august");
        hashMap.put("9","september");
        hashMap.put("10","October");
        hashMap.put("11","november");
        hashMap.put("12","December");

        System.out.println(hashMap.get("5"));

        hashMap.put("5", "dummy");

        System.out.println(hashMap.get("13"));

        if(hashMap.get("2")==null){
            System.out.println("value does not exist");
        }else{
            System.out.println("value exists");
        }
        System.out.println(hashMap.values());*/
//
//        StringDuplicate stringDuplicate = new StringDuplicate();
//        boolean str= stringDuplicate.test("engineer");
//        System.out.println(str);

//          AltNum altNum=new AltNum();
//         altNum.print(new int[]{1,2,3,4,5,6,7,8});

//        Palindrom palindrom = new Palindrom();
//        palindrom.print("abcba");


//        Scanner s=new Scanner(System.in);
//        int i = s.nextInt();
//        Factorial factorial = new Factorial();
//        int a= factorial.print(i);
//        System.out.println(a);
//        Fibonacci fibonacci = new Fibonacci();
//        int a=fibonacci.fab(i);
//        System.out.println(a);

//        Stack stack =new Stack(3);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.printstack();

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.next = third;
//          System.out.println("null is" + check(head));

        if (check(head) % 2 == 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
//         }
            Stack<Integer> stack = new Stack<Integer>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            System.out.println("size is " + stack.size());


        }
    }

}