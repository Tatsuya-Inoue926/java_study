import java.util.Random;
public class day5_Q7_2 {
    public static void main(String[] args) {
        float sum = 0;
        float avg = 0;
        int[] data = new int[5];
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(10) + 1;
            System.out.print(data[i] + " ");
        }
        System.out.println();

        System.out.print("合計値;");
        for (int i = 0; i < data.length; i++){
            sum += data[i];
        }    
        System.out.println(sum);
        System.out.print("平均値:");
        System.out.println(sum / data.length);  
        
        avg = (sum/data.length);

        System.out.print("平均値より小さい");
        for (int i = 0; i < data.length; i++){
            if (data[i] < avg ){
                System.out.print(data[i]+" ");
            }
        }
        System.out.println();
        System.out.print("平均値より大きい");    
        for (int i = 0; i < data.length; i++) {
            if (data[i] > avg ){
                System.out.print(data[i]+" ");
            }
        }

    }
    
}
