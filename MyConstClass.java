public class MyConstClass {
    private String expression;
    /* MyConstClassのコンストラクタがメソッドとして宣言されていることです。
    Javaでは、コンストラクタは戻り値を返すメソッドとして宣言する必要がありません。
    そのため、MyConstClassのコンストラクタの宣言を修正して、
    返り値の型を削除する必要があります。*/
    /*MyConstClassのコンストラクタがpublic Stringで宣言されていることです。
    コンストラクタは戻り値を返さないため、
    返り値の型を指定する必要はありません。
    そのため、コンストラクタの宣言を修正して、
    戻り値の型を削除する必要があります。 */
    public MyConstClass(String docs){
        expression = docs;
    }
    
    public String calcMethod(int num1, int num2){
        return  expression + (num1 * num2);
    }
    
}
