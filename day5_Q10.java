import java.util.Random;
public class day5_Q10 {
    public static void main(String[] args) {
        int[] data = new int[7];
        Random random = new Random();
        for (int i = 0; i < data.length; i++){
            data[i] = random.nextInt(10) + 1;
            System.out.print(data[i]+" ");
            
            for (int j = 0; j < data[i]; j++){
                System.out.print("☆");
            }
            System.out.println();
        }
        System.out.println();
    }  
}
