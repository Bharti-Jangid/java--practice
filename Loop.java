import java.util.Scanner;
public class Loop {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        // for(int counter = 0; counter < 10; counter =counter + 1){
        //     System.out.println("Bharti");
        // }
        // for(int counter = 0; counter < 51; counter++){
        //     System.out.println(counter);
        
        // }
        int sum = 0;
        for (int i = 1; i<=n; i++ ){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    
}
