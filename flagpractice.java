public class flagpractice {
    public static void main(String[] args){
        boolean flug = false;
        int sum = 0;
        int num = 0;
        //whileは()の処理が真なら動き続ける
        while (sum < 5 && flug == false){
            if(num < 9){
                System.out.println("現在の数値"+ num);
                num = num + 2;
                sum++;
            }else{
                flug = true;
            }
        }
        /*while(flug == true){
            if(num == 5){
                flug = true;
            }else{
                num += 1;
            }
        }*/
        System.out.println("現在の数値" + num);
        System.out.println("実行終了");
    }
    
}
