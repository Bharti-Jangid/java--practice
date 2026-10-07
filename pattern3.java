import java.util.Scanner;
public class pattern3 {
    public static void main(String args[]){
        int k = 4;

        for(int i=1; i<=k; i++){
            for(int j=1; j<=i; j++){
                int sum = j+i;
                if ( sum % 2 == 0){
                    System.out.print(" 1");
                } else {
                    System.out.print(" 0");
                }
            }  
                
            System.out.println();
        }
        //  int number = 1;
        
        // for(int i=1; i<=m; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(number);
        //         number++;
        //     }
        //     System.out.println();
        // }
        //outer loop
        // for(int i=1; i<=n; i++){
        //     for (int j=1; j<=n-i+1; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    }
}
