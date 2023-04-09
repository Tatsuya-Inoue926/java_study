public class day3_Q17 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*100)+1;
        System.out.println("数値 : " + num);
        if ( 50 >= num ){    
        System.out.println("50以下です");
            if ( num % 2 == 0){
                System.out.println("50以下の偶数です");
            }else{
                System.out.println("50以下の奇数です");
            }
        }else if ( num >= 50 && num % 2 ==0){
            System.out.println("50以上の偶数");
        }else{
            System.out.println("50以上の奇数");
        }
    }
}
