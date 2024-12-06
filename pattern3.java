/*5
1 2 3 4 5 
2 3 4 5
3 4 5
4 5
5
*/import java.util.*;
public class pattern3{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=5;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }/*A B C D E 
          B C D E
          C D E
          D E
          E
        */
        for(int i=1;i<=5;i++){
            for(int j=i;j<=n;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        /******
        ****
        ***
        **
        *
        */
       for(int i=1;i<=5;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}