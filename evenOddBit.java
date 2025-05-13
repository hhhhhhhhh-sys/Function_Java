public class evenOddBit {
    public static void checkingOddEven(int num){
        int bitmask=1;
        if((num&bitmask)==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
    public static void main(String[] args) {
        checkingOddEven(4);
        
    }
}
