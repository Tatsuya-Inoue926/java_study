import java.util.Random;
public class day3_Q13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(3)+1;
        System.out.println("数値 : " + num);
        if ( 1 == num ){    
        System.out.println("グー");
        }else if ( num > 0){
            System.out.println("チョキ");
        }else{
            System.out.println("パー");
        }
    } 
    
}
