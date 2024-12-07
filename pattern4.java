/*5
5 
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/import java.util.*;
public class pattern4{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }/*E
        E D
        E D C
        E D C B
        E D C B A
        */
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        /**
        **
        ***
        ****
        *****
        */
       for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}