

public class FindRepeat {

         int  find(int[]a,int key) {
           int count=0;
           for (int i = 0; i < a.length; i++) {//i is index
               if (a[i] == key) {
                   count=count+1;
               }
           }
//             for (int i : a) { for each integer i in a
//                 if (i == key) {//i is value
//                     count = count + 1;
//                 }
//             }
           return count;
       }

}
