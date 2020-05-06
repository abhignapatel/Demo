import java.util.HashMap;

public class Main {
    static boolean test(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//         int a[] = new int[]{1,2,3,4,5,5};
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
          AltNum altNum=new AltNum();
         altNum.print(new int[]{1,2,3,4,5,6,7,8});

//        StringDuplicate stringDuplicate = new StringDuplicate();
//        boolean str= stringDuplicate.test("engineer");
//        System.out.println(str);

//                AltNum altNum =  new AltNum();
//                altNum.print(new int[]{1,2,3,4,5,6,7});

        Palindrom palindrom = new Palindrom();
        boolean b= palindrom.print("abca");
        System.out.println(b);

//        PalindromNum palindromNum=new PalindromNum();
//         palindromNum.num(121);

    }
}