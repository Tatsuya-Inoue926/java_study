public class CDPlayer implements IPlayer{
    /*CDPlyaerクラスがIPlayerというインタフェースを実装していることを示しています。
    そして、CDPlayerクラスはIPlayerが定義する全てのメソッド(今だとplayメソッド)を実装しなければなりません。 */
    public void play(){
        System.out.println("CDを再生します");
    }  
    
}
