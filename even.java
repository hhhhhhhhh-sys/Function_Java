import java.util.*;
public class even {
    public static boolean isEven(int n){
        boolean isEven=false;
        if(n%2==0){
            isEven=true;
            return isEven;
        }else{
            isEven=false;
            return isEven;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check:");
        int n=sc.nextInt();
        System.out.print("The number is even: "+isEven(n));
        
    }
}
