import java.util.Random;
public class day5_Q11 {
    public static void main(String[] args){
        int [] a = new int[5];
        Random random = new Random();

        for ( int i = 0; i < a.length; i++){
            a[i] = random.nextInt(100) + 1;
            System.out.print(a[i]+" ");
        }
        System.out.println(); 
            for ( int i = 0; i < a.length; i++){ 
            if (a[i] >= 0 && 60 > a[i]){
                System.out.println("0以上60未満 "+ a[i]);
            }else if (a[i] >= 60 && 80 > a[i]){
                System.out.println("60以上80未満 "+ a[i]);
            }else if (a[i] >= 80){
                System.out.println("80以上 "+ a[i]);
            }
        }
    }
}
