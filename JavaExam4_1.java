public class JavaExam4_1 {

    public static void main(String[] args){
        CompareSample com = new CompareSample();
        ReferenceMove rm = new ReferenceMove();
        rm .reference(com);
        //cs.numをcom.numに変える処理をしている↑
        System.out.println(com.num);
    }
}
