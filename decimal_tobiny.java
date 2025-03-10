
import java.util.Scanner;

public class decimal_tobiny {
    public static void decimal_to_bny(int n){
        int rem=0;
        int pow=0;
        int myNum=n;
        int biNum=0;
        while(n>0){
            rem=n%2;
            biNum=biNum+(rem * (int)Math.pow(10,pow ));
            pow++;
            n=n/2;
                       
        }System.out.println("decimal of"+myNum+"is"+biNum);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int n=sc.nextInt();
        decimal_to_bny(n);
    }
}
