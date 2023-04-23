public class Calculator {
    //オーバーロードはcalcという同じものでも引数の数によってパターンを分けられる
    //引数が1のパターン
    public int calc(String str1){
        int intNum = Integer.parseInt(str1);
        intNum *= intNum;
        System.out.println("引数1："+ intNum);
        return intNum;
    }
    //引数が2のパターン
    public int calc(String str1, String str2){
        int intNum = Integer.parseInt(str2);
        int intNum2 = Integer.parseInt(str1);
        intNum *= intNum2;
        System.out.println("引数2："+ intNum);
        return intNum;
    }
}
