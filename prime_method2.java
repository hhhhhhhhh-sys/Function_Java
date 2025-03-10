public class prime_method2 {
    public static boolean isPrime(int n){   
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                return  isPrime;
            }

        }return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(6));
    }
}
