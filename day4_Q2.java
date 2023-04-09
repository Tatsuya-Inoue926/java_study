public class day4_Q2 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*10)+1;
        System.out.println("数値 : " + num);
            int i = 0;
            while( i < num){
                System.out.print("☆");
                i++;
            }
            System.out.println();
        } 
    
}
