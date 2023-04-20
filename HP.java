public class HP {
    private int HP = 0;
    private int recover = 0;
    private int damage = 0;

    public HP()
    {
        System.out.println("HPオブジェクト作成");
        HP = 10;
        System.out.println("現在のHP：" + HP);
    }
    public void Hit()
    {
        if ( HP > 0){
            damage++;
            HP = HP - damage;
        }
        System.out.println("ダメージ："+ damage );
        System.out.println("残りHP" + HP );
        damage = 0;
    }
    public void recover(){
        if ( HP < 10 ){
            HP += 1;
            recover = 1;
            System.out.println("HPを"+ recover +"回復しました");
            System.out.println("現在のHP:" + HP);
        }else{
            System.out.println("HPは満タンだ");
    }
    }
    public void Finish(){
        System.out.println("戦闘終了");
    }
}  
