package Practice;

public class Practice {
    public static void main(String[] args) {
        // 練習5-1
        System.out.println("【自己紹介】");
        introduceOneself();

        // 練習5-2
        System.out.println("【メール送信】");
        email("ご挨拶", "xxx@xxx.com", "こんにちは！"); // 引数が3つの方のemailを呼び出す

        // 練習5-3
        System.out.println("【メール送信(件名なし)】");
        email("yyyy@yyy.com", "無題のメールだよ！"); // 引数が2つの方のemailを呼び出す

        // 練習5-4
        System.out.println("【三角形の面積】");
        final double bottom = 10.0;
        final double height = 5.0;
        System.out.println(
                "底辺" + bottom + "cm、" + "高さ" + height + "cmの三角形の面積は" + calcTriangleArea(bottom, height) + "平方cmです。");

        System.out.println("【円の面積】");
        final double radius = 5.0;
        System.out.println(
                "半径" + radius + "cmの円の面積は" + calcCircleArea(radius) + "平方cmです。");
    }

    /**
     * 自己紹介
     */
    private static void introduceOneself() {
        final String name = "田中太郎";
        final int age = 20;
        final double height = 180.6;
        final char zodiac = '辰';

        // 複数回利用する文言については定数として持っておく
        final String desu = "です。";

        System.out.println("私の名前は" + name + desu);
        System.out.println("歳は" + age + "歳" + desu);
        System.out.println("身長は" + height + "cm" + desu);
        System.out.println("十二支は" + zodiac + desu);
    }

    /**
     * メールの送信完了メッセージを出力する
     * 
     * @param title   件名
     * @param address 宛先
     * @param text    本文
     */
    private static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("件名: " + title);
        System.out.println("本文: " + text);
    }

    /**
     * 無題メールの送信完了メッセージを出力する。
     * 同じメソッド名でも引数が違えばオーバーロードとして共存できる
     * 
     * @param address 宛先
     * @param text    本文
     */
    private static void email(String address, String text) {
        // 件名ありのemailと中身は一緒なのでtitleを"無題"にして呼び出すだけ
        email("無題", address, text);
    }

    /**
     * 三角形の面積を求める
     * 
     * @param bottom 底辺の長さ
     * @param height 高さ
     */
    private static double calcTriangleArea(double bottom, double height) {
        return bottom * height / 2;
    }

    /**
     * 円の面積を求める
     * 
     * @param radius 半径の長さ
     */
    private static double calcCircleArea(double radius) {
        return radius * radius * 3.14;
    }
}
