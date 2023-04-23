public class forpractice {
    //For文の二重ループの参考例
    public static void main(String[] args){
        int num = 1;
        int sum = 1;
        for(int i = 0; i < 6; i++){
            for ( int j = 0; j < 3; j++){
            System.out.println( "現在の数値は"+num );
            num += 1;
            sum += num;
            }
        }
        System.out.println(sum);
        System.out.println("実行終了");
    }
}
