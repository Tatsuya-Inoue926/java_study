import java.util.Random;
public class day3_Q12 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(11)-10;
        System.out.println("数値 : " + num);
        if ( 0 > num ){    
        System.out.println("負の値です");
        }else if ( num > 0){
            System.out.println("正の値です");
        }else{
            System.out.println("0です");
        }
    }  
}
