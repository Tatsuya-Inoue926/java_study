import java.util.Random;
public class day3_Q18 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(36)-10;
        System.out.println("摂氏" + num + "度");
        if ( 30 <= num ){    
        System.out.println("真夏日です");
        }else if ( num >= 25 && 30 > num){
            System.out.println("夏日です");
        }else if ( num < 0){
            System.out.println("真冬日です");
        }else{
            System.out.println("普通");
        }
    } 
    
}
