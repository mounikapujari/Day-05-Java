import java.util.*;
public class Armstrongnum{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            int temp=n;
            int rev=0;
            while(n>0){
                int dig=n%10;
                rev=rev+dig*dig*dig;
                n/=10;
            }
            System.out.println(rev);
            if(temp==rev){
                System.out.println("Armstrong number");
            }else{
                System.out.println("not Armstrong number");
            }
        }
    }
}