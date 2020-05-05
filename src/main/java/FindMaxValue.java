public class FindMaxValue {
    public int findMax(int[] a) {
        int answer = Integer.MIN_VALUE;
        for (int i :a) {
            if(i>answer){
                answer = i;
            }
        }
        return answer;
    }
}
