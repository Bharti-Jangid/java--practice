import java.util.Scanner;

public class iflse {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // if (age > 18){
        //     System.out.print("Adult");
        // } else {
        //     System.out.print("Not Adult");
        // }
        if  ( a == b){
            System.out.print("Equal");
        } else {
            if (a > b){
                System.out.print( "a is grater");
            } else {
                System.out.print("a is lesser");
            }
        }

    }
}
