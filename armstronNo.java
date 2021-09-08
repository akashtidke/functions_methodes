import java.util.Scanner;
//Q is armstrong number or not
public class armstronNo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        System.out.println(isArmstrong(n));
    }
    static boolean isArmstrong(int n){
        int count=0;
        int ans=0;
        int num=n;
        int x=n;
        while (num!=0){
            num=num/10;
            count++;
        }
        while(n!=0){
            int r=n%10;
            n=n/10;
            ans=ans+(int)Math.pow(r,count);
        }
if(x==ans){
    return true;
}
return false;
    }
}
