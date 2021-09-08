import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int a){
       if(a<=1){
           return false;
       }
     int i=2;
       while (i*i<=a){
           if(a%i==0){
               return false;
           }
           i++;
       }
       if (i*i>a){
           return true;
       }
return false;
    }
}
