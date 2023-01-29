package animal;

public class Animal {
    //名前と年齢のフィールド
    private String name;
    private int age;

    //コンストラクタ
    public Animal() {

    }

    //名前を年齢を引数に取るコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }

    //話すメソッド
    public void say(Animal opponent) {
        System.out.println(this.name + " です。 " + this.age + " 歳です。");
    }

}
