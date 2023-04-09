import java.util.Random;
public class day5_Q8 {
    public static void main(String[] args) {
        Random random = new Random();
        int zeromath = 0;
        int[] data = new int[5];

    for (int i = 0; i < data.length; i++){
        data[i] = random.nextInt(21) - 10;
            System.out.print(data[i] + " ");
    }
    System.out.println();

    System.out.print("0より大きい数:");
    for (int i = 0; i < data.length; i++){
    if (data[i] > 0){
        System.out.print(data[i]+" ");
    }
    }
    System.out.println();
    System.out.print("0より小さい数");
    for (int i = 0; i < data.length; i++){
        if (data[i] < 0){
            System.out.print(data[i]+" ");
        }
}
    System.out.println();
    System.out.print("0の個数");
    for (int i = 0; i < data.length; i++){
        if (data[i] == 0){
            zeromath++;
    }
}
//For文が終了してから変数の数値を取り出すことで数が増えていることを表示できる//
System.out.print(zeromath);  
    }
}
