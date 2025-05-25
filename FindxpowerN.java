public class FindxpowerN {
    // public static int power(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }return x*power(x, n-1);
    // }
    public static int OptimizedPower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPower=OptimizedPower(a, n/2);
        int halfPowerSq=halfPower*halfPower;
        if(n%2!=0){
            halfPowerSq=a*halfPowerSq;
        }
        return halfPowerSq;
    }
    
    public static void main(String[] args) {
        
    }
}
