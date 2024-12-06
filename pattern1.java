/*5
1 2 3 4 5 
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5 
1 2 3 4 5
*/import java.util.*;
public class pattern1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        /*A B C D E 
A B C D E
A B C D E
A B C D E
A B C D E
        */
       for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }

    }
}