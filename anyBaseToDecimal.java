import java.util.Scanner;

public class anyBaseToDecimal {
//    1. You are given a number n.
//2. You are given a base b. n is a number on base b.
//3. You are required to convert the number n into its corresponding value in decimal number system.
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int b= scn.nextInt();
        int bd=getValueIndecimal(n,b);
        System.out.println(bd);
    }
    public static int getValueIndecimal(int n, int b){
        int ans=0;
        int p=1;
        while (n!=0){
            int r=n%10;
            n=n/10;
            ans+=r*p;
            p=p*b;
        }
        return ans;
    }
}
