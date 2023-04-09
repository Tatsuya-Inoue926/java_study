public class Calculation {
    //int型フィールドnumber1の作成(private変数)
    private int number1 = 0;
    //int型のフィールドnumber2の作成(private変数)
    private int number2 = 0;
    //number1変数のセッター
    public void setNumber1(int number1){
        this.number1 = number1;
    }
    //number2変数のセッター
    public void setNumber2(int number2){
        this.number2 = number2;
    }
    //number1変数のゲッター
    public int getNumber1(){
        return number1;
    }
    //number2変数のゲッター
    public int getNumber2(){
        return number2;
    }
    //addメソッドの作成
    public int add(){
        return number1 + number2 ;
    }
    //subメソッドの作成
    public int sub(){
        return number1 - number2;
    }
}
