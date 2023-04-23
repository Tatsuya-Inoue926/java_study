public class Calculator {

    public int calc(String str1){
        int intNum = Integer.parseInt(str1);
        intNum *= intNum;
        return intNum;
    }
    public int calc(String str1, String str2){
        int intNum = Integer.parseInt(str2);
        int intNum2 = Integer.parseInt(str1);
        intNum *= intNum2;
        return intNum;
    }
}
