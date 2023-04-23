public class JavaExam4_3 {

    public static void main(String[] args){
        AbstractPlayer [] abstractplayer = {new ExDVDPlayer(), new ExCDPlayer()};
        for(AbstractPlayer abs :abstractplayer){
            //先にExDVDPlayerのfor文が実行(play,stop,electrify)されて
            //その後ExCDPlayerのfor文が実行される
            abs.play();
            abs.stop();
            abs.electrify();
        } 
    }
    
}
