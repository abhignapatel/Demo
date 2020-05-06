public class Palindrom {
boolean  print(String s){

        char[] arr = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while (i<j)
        {
            if(arr[i]!=arr[j])
            {
                return false;
            }
            i=i+1;
            j=j-1;
        }
      return true;
   }
}
