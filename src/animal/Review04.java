package animal;

public class Review04 {

    public static void main(String[] args) {
        //Humanクラスのインスタンスを3つ作成
        Human tanaka = new Human("田中　太郎", 25, "電車");
        Human suzuki = new Human("鈴木　次郎", 30, "野球");
        Human sato = new Human("佐藤　花子", 20, "映画");

        //田中の出力
        tanaka.say(tanaka);
        tanaka.think(tanaka);

        //鈴木の出力
        suzuki.say(suzuki);
        suzuki.think(suzuki);

        //佐藤の出力
        sato.say(sato);
        sato.think(sato);

    }

}
