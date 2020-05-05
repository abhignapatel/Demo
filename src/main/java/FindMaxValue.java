public class FindMaxValue {
    public int findMax(int[] a) {
        int answer = 0;
        for (int i :a) {
            if(i>answer){
                answer = i;

            }
        }
        return answer;
    }
}
