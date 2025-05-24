public class LastOccurance {
    public static int Loccurance(int []arr,int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=Loccurance(arr, key, i+1);
        if(isfound==-1&& arr[i]==key){
            return i;
        }return isfound;

    }
    public static void main(String[] args) {
        
        
    }
}
