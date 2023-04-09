import java.util.Random;
public class day5_Q6 {
    public static void main(String[] args) {
        int max = 0;
        int min = 10;
        int sum = 0;
        int[] data = new int[10];
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(10) + 1;
            System.out.print(data[i] + " ");
        }
        System.out.println();

        System.out.print("最大値：");
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        System.out.println(max);

        System.out.print("最小値：");
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        System.out.println(min);

        System.out.print("平均値:");
        for (int i = 0; i < data.length; i++){
            sum += data[i];
        }    
        System.out.println(sum / data.length);
    }
}
