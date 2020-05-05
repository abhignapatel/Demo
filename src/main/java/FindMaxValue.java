public class FindMax {
    int find(int[] a){
        int answer = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>a[i+1]){
                answer = a[i];
            }
        }
        return answer;
    }
}
