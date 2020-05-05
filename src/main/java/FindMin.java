import java.awt.image.BandedSampleModel;

public class FindMin {
    int   min(int[] a){
        int ans = Integer.MAX_VALUE;
//       for(int i=0;i<a.length;i++){
//          if(a[i]<ans){
//             ans =a[i];
//          }
//       }
        for (int i: a) {
            if(i<ans){
                ans =i;
            }
        }
       return ans;
    }
}
