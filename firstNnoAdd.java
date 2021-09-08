import java.util.Scanner;
//first n natural no.addition
public class firstNnoAdd {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int x=addn(n);
        System.out.println(x);
    }
    static int addn(int n){
        int ans=0;
       for(int i=1;i<=n;i++){
           ans+=i;
        }
        return ans;
    }
}
