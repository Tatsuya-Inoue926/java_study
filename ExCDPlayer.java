public class ExCDPlayer implements AbstractPlayer{
    //implementsは性質上AbstractPlayerで定義した3つのメソッド全ての
    //処理内容を記述しないといけない
    public void play(){
        System.out.println("CDを再生します");
    }
    public void stop(){
        System.out.println("CDを停止します");
    }
    public void electrify(){
        System.out.println("電気を使う");
    }
    
}
