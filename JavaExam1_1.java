public class JavaExam1_1 {
    public static void main(String[] args){
        int price = 300;
        int num = 10;
        double amount = num * price;
        if ( num >= 10){
            amount = amount * 0.9;
            System.out.println("合計金額は" + (int)amount + "円です。");
        }else{
            System.out.println("合計金額は" + (int)amount + "円です。");
        }
    }
    
}
