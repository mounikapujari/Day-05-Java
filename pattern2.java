/*0 1 2 3 
1 2 3 4
2 3 4 5
3 4 5 6
*/import java.util.*;
public class pattern2{
    public static void main(String args[]){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(j+i+" ");
            }
            System.out.println();
        }
    }
}