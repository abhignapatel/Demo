public class Factorial {
    int print(int n){

        if(n<=1){
            return 1;
        }
       else{
           return n * print(n-1);
        }
    }
}
