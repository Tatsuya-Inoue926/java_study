public class amaP2 {
    /*ランダムに1から6の数字が表示されて6ならば「あたり」と表示されるコードを書いて */
    public static void main(String[] args) {
        int dice = (int)(Math.random()*6)+1;
        System.out.println(dice);
        if(dice == 6){
            System.out.println("あたり");
        }
        
}
}
