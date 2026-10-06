import java.util.Scanner;
public class pattern1{
    public static void main(String agrs[]){
         int m = 5;

         for(int i=m; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
         }
        //  for ( int i=0; i<n; i++){
        //     for(int j=0; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }
    }
}