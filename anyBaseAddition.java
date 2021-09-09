import java.util.Scanner;

public class anyBaseAddition {
//    1. You are given a base b.
//2. You are given two numbers n1 and n2 of base b.
//3. You are required to add the two numbes and print their value in base b.
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int b= scn.nextInt();
         int n1= scn.nextInt();
         int n2= scn.nextInt();
         System.out.println(aba(b,n1,n2));

    }
    static int aba(int b,int n1,int n2){
        int ans=0;
        int power=1;
        int carry=0;
        while (n1!=0||n2!=0||carry!=0){
            int r1=n1%10;
            int r2=n2%10;
             n1=n1/10;
             n2=n2/10;
             int sum=r1+r2+carry;
             int q=sum/b;
             int r=sum%b;
             ans+=(r*power);
             carry=q;
             power=power*10;
        }
        return ans;

    }
}
