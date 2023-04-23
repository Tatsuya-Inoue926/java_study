public class JavaExam4_2 {
    public static void main (String[] args){
        IPlayer player1 = new CDPlayer();
        player1.play();
        IPlayer player2 = new DVDPlayer();
        player2.play();
    }
    
}
