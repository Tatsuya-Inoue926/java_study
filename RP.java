public class RP {
    public static void main(String[] args){
        HP h = new HP();
        h.Hit();
        h.Hit();
        h.recover();
        Apper a = new Apper();
        /*extendsしたらHPオブジェクトももう一回作られる */
        a.Apper();
        a.Hit();
        a.Attack(8,10);
        h.Finish();
    }
}
