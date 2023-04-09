public class day4_Q13 {
    public static void main(String[] args){
        
        int num = (int)(Math.random()*10)+1;
        System.out.println(num);
        if (num >= 5){
            for ( int i = 0; i < num; i++){
                System.out.print("☆");
            }
            System.out.println();
        }else{
            System.out.println("発生した数値"+num);
        }
    }
    
}
