import java.util.*;
public class avg_of_three {
    public static int average(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Enter the second number:");
        int b=sc.nextInt();
        System.out.print("Enter the third number:");
        int c=sc.nextInt();
        System.out.println("Average of "+a+"and "+b+"is"+average(a, b, c));
        
    }
}
