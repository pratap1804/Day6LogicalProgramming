import java.util.Scanner;

public class Series {
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter How Many Terms?");
        int n=sc.nextInt();

        long f1=0;
        long f2=1;
        long f=f1+f2;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f);

        int count =3;
        while(count<n) {
            f1=f2;
            f2=f;
            f=f1+f2;
            System.out.println(f);
            count++;
        }
    }
}
