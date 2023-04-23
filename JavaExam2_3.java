public class JavaExam2_3 {
    public static void main(String[] args){
        int [] array = { 100, 30, 70};
        int sum = 0; 
        for ( int i : array){
            System.out.println("各点は"+ i);
            sum += i;
        }
        System.out.println("平均点は"+ (double)(sum / array.length));
    }
    
}
