import java.util.*;
public class factorial {
    public static int  fac_of_num(int num1){
        int fact=1;
        for(int i=1;i<=num1;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        fac_of_num(n);
        System.out.println("Factorial of a given number is : "+fac_of_num(n));
    }
}
