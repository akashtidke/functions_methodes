import java.util.Scanner;
//1. You are given a number n.
//2. You are given a digit d.
//3. You are required to calculate the frequency of digit d in number n.
public class digitFrequcy {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
int d= scn.nextInt();
int ans=getfreq(n,d);
System.out.println(ans);
    }
    static int getfreq(int n,int d){
int count=0;
        while (n!=0){
         int r=n%10;
         n=n/10;
         if(r==d){
             count++;
         }
        }
        return count;
    }

}
