public class day3_Q15 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*100)+1;
        System.out.println("数値 : " + num);
        if ( num >= 80){    
        System.out.println("優");
        }else if ( 80 > num && num >= 70){
            System.out.println("良");
        }else if ( 70 > num && num >= 60){
            System.out.println("可");
        }else{
            System.out.println("不可");
        }
    } 
    
}
