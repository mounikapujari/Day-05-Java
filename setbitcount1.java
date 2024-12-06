import java.util.*;
public class setbitcount1{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        while(n>0){
            c+=n&1;
            n>>=1;
        }
        System.out.println(c);
    }
}