public class Palindrom {
boolean print(String s){
        char[] arr=s.toCharArray();
          int i=0;
          int j=i-1;
        while(i<j)
       {
           if(arr[i]==arr[j]){
               i=i+1;
               j=j-1;
           }System.out.println("palindrom");
       }
    return false;
   }
}
