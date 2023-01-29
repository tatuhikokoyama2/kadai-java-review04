package animal;

public class Human extends Animal  implements Thinkable{
  //趣味のフィールド
    private String hobby;

    public Human() {

    }

    //名前、年齢、趣味のコンストラクタ
    public Human(String name, int age, String hobby) {
        //スーパークラス（Animal）のコンストラクタを呼び出し
        super(name, age);
        this.hobby = hobby;
    }

    @Override
    //趣味の出力をするメソッド
    public void think(Human opponent) {
        System.out.println("私は" + hobby + "について考えています。");

    }

}
