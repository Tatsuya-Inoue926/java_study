public class obstudy_1 {
    public static void main(String args[]){
        //オブジェクトの生成
        //クラスTelevisionを元に新たなオブジェクトtv○を作る
        Television tv1 = new Television();
        Television tv2 = new Television();
        Television tv3 = new Television();
        
        //Televisonクラス内のsetPlaceの処理を動かす
        tv1.setPlace("居間");
        tv2.setPlace("寝室");
        tv3.setPlace("リビング");
    
        tv1.setChannel(1);
        tv2.setChannel(8);
        tv3.setChannel(5);

        tv1.setFloor(1);
        tv2.setFloor(2);
        tv3.setFloor(2);
    
        tv1.dispChannel();
        tv2.dispChannel();
        tv3.dispChannel();
      }
    }
    
    //テレビ内部のクラス
    class Television{
        //チャンネル番号だから数値型のintを使う、変数宣言
      int channelNo;
      //Place=場所だから文字型のStringを使う、変数宣言
      String place;
      int floor;
        
      //戻す値やデータがない場合、voidを使用する
      //上のクラスのsetchannnelの引数の処理について記述
      //setchannelの引数が3ならnewChannelNoの数値が3になり、channelNoの数値も3になる
      void setChannel(int newChannelNo){
        channelNo = newChannelNo;
      }
    
      void setPlace(String newPlace){
        place = newPlace;
      }

      void setFloor(int newFloor){
        floor = newFloor;
      }
    
      void dispChannel(){
        System.out.println(floor + "の" + place + "にあるテレビの現在のチャンネルは " +  channelNo + " です");
      }
}
