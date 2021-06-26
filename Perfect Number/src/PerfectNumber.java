import java.util.Scanner;

public class PerfectNumber {
    public static void main( String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter Number: " );
        int num = sc.nextInt();
        int total=0;

        for (int i=1; i<=num/2; i++) {
            if(num % i ==0) {
                total+=i;
                System.out.println(i);
            }
        }

        if(total == num ){
            System.out.println(num+ " is a perfect number");
        }
        else {
            System.out.println(num+ " isn't a perfect number");
        }
    }
}
