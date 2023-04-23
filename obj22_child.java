public class obj22_child {
    int HP = 15;
    public double recover = (int)(Math.random()*10+1);
    int num = 10;
    void charge(){
        double power = (int)(Math.random()*10);
        System.out.println("力をためる："+(int)power+"の威力が上昇");
    }
    int attack(int AT){
        double power = (int)(Math.random()*10);
        if ( HP > 0){
        System.out.println((int)(power + AT )+"ダメージを与えた!");
        return (int)power + AT;
        }else{
            System.out.println("返事がないただの屍のようだ");
            return (int)power + AT;
        }
    }
    void damage(){
        double damage = (int)(Math.random()*10+1);
        System.out.println("敵の攻撃!"+ (int)damage +"ダメージを受けた!");
        HP = HP - (int)damage;
        System.out.println("残りHP："+ HP);
        if(HP < 1){
            System.out.println("戦闘終了");
        }
    }
    void recover(){
        System.out.println("回復呪文!"+ (int)recover +"回復した!");
        HP = HP + (int)recover;
    }
    void result(){
        if(HP > 0){
            System.out.println("Win");
        }else{
            System.out.println("Lose");
        }
    }
    
    
}
