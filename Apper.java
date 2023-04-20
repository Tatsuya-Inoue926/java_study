public class Apper extends HP{
    private String monster = "スライム";
    private int num;
    private int block;
    public void Apper(){
        System.out.println("Apperオブジェクトの作成");
        System.out.println("野生の"+ monster + "が現れた！");
    }
    
    public void Attack(int num, int block){
        System.out.println("攻撃力"+ num);
        System.out.println("防御力"+ block);
    }
}
