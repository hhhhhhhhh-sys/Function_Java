import java.util.*;
public class sumOfdigit {
    public static int digitSum(int n){
        int sum=0;
        
        while(n>0){
            int d=n%10;
            sum+=d;
            n/=10;
        }return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int result=digitSum(n);
        System.out.println("Sum of digit is : "+result);
    }
}
