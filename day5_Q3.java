import java.util.Random;
public class day5_Q3 {
    public static void main(String[] args) {
        // 配列の大きさ
        int size = 10;
        
        // 乱数を発生させるためのオブジェクトを作成
        Random random = new Random();
        
        // 配列aを作成し、乱数を発生させて値を代入する
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            // 1から10までの乱数を発生させて値を代入する
            a[i] = random.nextInt(100) + 1;
        } 
        // 配列aの値を表示する
        for (int i = 0; i < size; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
                if ( a[i] % 2 == 0){
                    System.out.println("偶数" + a[i]);
                }else{
                System.out.println("奇数" + a[i]); 
                }
        }
        }
    }
