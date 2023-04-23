public class JavaExam1_2 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 12;
        if( num1 > num2){
            System.out.println("num1："+ num1);
            System.out.println("num2："+ num2);
            System.out.println("num1の方が大きいです");
        }else if(num2 > num1){
            System.out.println("num1："+ num1);
            System.out.println("num2："+ num2);
            System.out.println("num2の方が大きいです");
        }else if(num1 == num2){
            System.out.println("num1："+ num1);
            System.out.println("num2："+ num2);
            System.out.println("num1とnum2は等しいです");
        }
    }
    
}
