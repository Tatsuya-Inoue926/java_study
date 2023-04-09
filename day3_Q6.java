public class day3_Q6 {
 
        public static void main(String[] args) {
            int num = (int)(Math.random()*6)+1;
            System.out.println("数値 : " + num);
            if ( num >= 3){    //  1から6までの乱数を発生させる
            System.out.println("3以上です");
            }
        }
}
