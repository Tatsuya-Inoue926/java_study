public class day3_Q4 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*100)+1;
        System.out.println(num);

        if ( num >= 90 || num <= 10 ){
            System.out.println("10以下か90以上の値です。");
        }
    
    }
}
