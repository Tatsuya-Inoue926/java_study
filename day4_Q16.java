public class day4_Q16 {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                int k = i * j;
                System.out.print(" "+i +"*"+j+"="+ k);
                if (j % 10 == 0){
                    System.out.println();
                }
            }
            }
        }
}
