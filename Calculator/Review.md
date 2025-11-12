# 変数名にこだわる
```java
 System.out.print("1つ目の整数を入力してください: ");
int a = scanner.nextInt();

System.out.print("2つ目の整数を入力してください: ");
int b = scanner.nextInt();
```

a, b のような変数名は避けた方がいいです。<br/>
基本自分以外の人がメンテナンスすることがほとんどなのでこの変数が何を表しているのかを明確にしておくほうが親切です。

シンプルに`firstNumber`とか`secondNumber`で良いので意味のある名前にしてほしいです。<br/>
コードを見たときにいかに思考回数を少なくして理解してもらえるかを意識するといいと思います。

# 同じ情報を示すものは共通化する
プログラミングではDRY(Don't Repeat Yourself)原則に則ることがベストプラクティスとされています。<br/>
入力で受け取る1~4の数字とswitchで使われている数字は同じ情報を示しているため、定数化しておくと良いでしょう。

```java
public class CalculatorApp5 {
    // 定数として定義
    private static final int ADD = 1;
    private static final int SUBTRACT = 2;
    private static final int MULTIPLY = 3;
    private static final int DIVIDE = 4;
    
    public static void main(String[] args) {
        // 略

        // 定数を利用
        System.out.println(ADD + ": 足し算");
        System.out.println(SUBTRACT + ": 引き算");
        System.out.println(MULTIPLY + ": 掛け算");
        System.out.println(DIVIDE + ": 割り算");

        switch (choice) {
            case ADD:
                result = add(a, b);
                break;
            case SUBTRACT:
                result = subtract(a, b);
                break;
            // 以降も一緒
        }
    }
}
```

仮に足し算を示す数字が変わったときも、定数の中身を書き換えるだけで修正が完了します。変更に強いコードを書くには同じ情報を複数箇所にバラつかせないことが大切です。

# 不要なローカル変数をなくす
switchの外に`result`と`valid`がありますが、ローカル変数はなるべく減らすのがセオリーです。

理由は
- どこで値が変わるかわからないから解析が大変
- 意図しない場所で値が書き換えられることによるバグを減らす
です

**修正例**
```java
// 結果が取得できるなら即座に出力
switch (choice) {
    case 1:
        printResult(add(a, b));
        break;
    case 2:
        printResult(subtract(a, b));
        break;
    case 3:
        printResult(multiply(a, b));
        break;
    case 4:
        if (b == 0) {
            System.out.println("エラー: 0 で割ることはできません。");
        } else {
            printResult(divide(a, b));
        }
        break;
    default:
        System.out.println("無効な選択です。");
}

// 略

// 結果を出力するメソッド
// 毎回System.out.printlnを書かずに共通化しておくと良い
private static void printResult(int result) {
    System.out.println("結果: " + result);
}
```

この指摘をすべて受領すると、同じファイル内にあるCalculatorApp5_after.javaの実装になります。