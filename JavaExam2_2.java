public class JavaExam2_2 {
    public static void main(String[] args){
        int mokuhyou = 10000;
        int chokin = 5000;
        int month = 1;
        while(chokin < mokuhyou){
            chokin += 1000;
            System.out.println(month + "ヶ月目:貯金額は"+ chokin + "円です。");
            month += 1;
        }
        System.out.println("10000円貯めるのに" + (month - 1) + "ヶ月かかります。");
    }
    
}
