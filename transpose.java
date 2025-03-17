public class transpose {
    public static void main(String[] args) {
        int [][]array={{1,2,3},{4,5,6},{7,8,9}};
        int row=array.length;
        int col=array[0].length;
        int[][] transpose=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=array[i][j];
            }
        }for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(transpose[i][j]);
            }System.out.println();
        }
    }
}
