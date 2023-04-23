public class array_plactice {
    public static void main(String[]args){
        int [][] d = new int[4][5];
        //縦4、横5の多次元配列の生成
        for(int i = 0; i < d.length; i++){
            for(int j = 0; j < d[i].length; j++){
                d[i][j] = i + j;
                System.out.print(i+j+" ");
            }
            //中の2個目のFor文の処理が終わったら改行
            System.out.println();
        }
    }
    
}
