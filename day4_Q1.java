public class day4_Q1 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*10)+1;
        System.out.println("数値 : " + num);
        for ( int i = 0; i < num; i ++){
            System.out.print("☆");
        }
        System.out.println();
    } 
    
}
