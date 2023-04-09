import java.util.Random;
public class day5_Q12 {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        Random random = new Random();

        for( int i = 0; i < a.length ;i++){
            for(int j = 0; j < a.length ;j++){
                a[i][j] = random.nextInt(10);
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

}
}
