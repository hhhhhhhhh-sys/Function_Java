import java.util.*;
public class binary_to_dcial {
    public static void binTodec(int binum){
        int myNum=binum;
        int pow=0,decNum=0;
        while(binum>0){
            int lastDigit=binum%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2, pow));
            pow++;
            binum/=10;
        }
        System.out.println("Decimal of "+ myNum +" is " + decNum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the binary number:");
        int n=sc.nextInt();
        binTodec(n);
        

        
        
    }
}
