import java.util.Scanner;

public class anyBaseSubstraction {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2){
        int ans=0;
        int carry=0;
        int power=1;
        while(n2>0){

            int r1=n1%10;

            int r2=n2%10;
            n1=n1/10;
            n2=n2/10;

            //
            int d=0;
            r2=r2+carry;
            if(r2>=r1){
                carry=0;
                d=r2-r1;
            }else{
                carry=-1;
                d=r2+b-r1;
            }
            ans=ans+d*power;
            power=power*10;


        }
        return ans;
    }
}
