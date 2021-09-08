import java.util.Scanner;
//Q Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
public class maxMinN0 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int n3=scn.nextInt();
        int ans1=max(n1,n2,n3);
        System.out.println("maxNo"+" "+ans1);
        int ans2=min(n1,n2,n3);
        System.out.println("minNO"+" "+ans2);
    }
    static int max(int n1,int n2,int n3){
        int maxN0=n1;
        if(n2>maxN0){
            maxN0=n2;
        }if(n3>maxN0){
            maxN0=n3;
        }
        return maxN0;
    }
    static int min(int n1,int n2,int n3){
        int minNo=n1;
        if(minNo>n2){
           minNo=n2;
        }if (minNo>n3){
            minNo=n3;
        }
        return minNo;
    }
}
