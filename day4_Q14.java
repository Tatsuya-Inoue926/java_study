public class day4_Q14 {
    public static void main(String[] args){
        
        int num = (int)(Math.random()*10)+1;
        System.out.println(num);
        if (num % 2 == 0){
            for ( int i = 0; i < num; i++){
                System.out.print("⭐️");
            }
            System.out.println();
        }else if ( num % 2 == 1){
            for ( int i = 0; i < num; i++){
                System.out.print("☆");
            }
            System.out.println();
        }
    }
    
}
