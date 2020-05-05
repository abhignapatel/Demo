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
//        int a[] = new int[]{1,2,3,4,5,5};
//        FindRepeat fr = new FindRepeat();
//        int b = fr.find(a,5);
//        System.out.println(b);

//        SumofArray sa = new SumofArray();
//        int a = sa.sum(new int[]{1,2,3,4,5});
//        System.out.println(a);

        FindMaxValue findMax = new FindMaxValue();
        int[] a = {2,4,6,8,1};
        int max = findMax.findMax(a);
        System.out.println(max);
    }
}