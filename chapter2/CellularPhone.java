public class CellularPhone {
    //インスタンス変数の定義
    //電話番号
    String telephoneNumber;
    //電池残量
    int batteryRemaining = 100;

    //コンストラクタの定義
    public CellularPhone(String telNum){
        telephoneNumber = telNum;
    }
    
    //メソッド：着信したら呼び出し音が鳴る
    public void receiveCall(String caller){
        System.out.println("ring! ring! ring!");
        System.out.println("Calling from " + caller);
    }

    //通話
    public void talkSomething(String msg){
        System.out.println("[" + msg + "]");
    }

    //切断
    public void hungUp(){
        System.out.println("bye!");
        batteryRemaining = batteryRemaining - 10;
        System.out.println("batteryRemaining = " + batteryRemaining);
    }

}
