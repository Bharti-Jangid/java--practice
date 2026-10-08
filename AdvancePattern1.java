import java.util.Scanner;
public class AdvancePattern1 {
    public static void main(String args[]){
        int m =5;
         
        for(int i=1; i<=m; i++){
            for(int j=1; j<=m-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=5; j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }
    }
}
