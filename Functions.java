import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int b=scn.nextInt();
        int x=sum(n,b);
        System.out.println(x);
    }
    static int sum(int n,int b) {
    int c=n+b;
        return c;
    }
}
