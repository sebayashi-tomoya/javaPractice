package Calculator;

import java.util.Scanner;

public class CalculatorApp5_after {
    // ユーザーが入力して指定する計算法
    private static final int ADD = 1;
    private static final int SUBTRACT = 2;
    private static final int MULTIPLY = 3;
    private static final int DIVIDE = 4;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("1つ目の整数を入力してください: ");
            int first = scanner.nextInt();

            System.out.print("2つ目の整数を入力してください: ");
            int second = scanner.nextInt();

            System.out.println("\n計算方法を選んでください:");
            System.out.println(ADD + ": 足し算");
            System.out.println(SUBTRACT + ": 引き算");
            System.out.println(MULTIPLY + ": 掛け算");
            System.out.println(DIVIDE + ": 割り算");
            System.out.print("→ ");
            int choice = scanner.nextInt();

            switch (choice) {
                case ADD:
                    printResult(add(first, second));
                    break;
                case SUBTRACT:
                    printResult(subtract(first, second));
                    break;
                case MULTIPLY:
                    printResult(multiply(first, second));
                    break;
                case DIVIDE:
                    if (second == 0) {
                        System.out.println("エラー: 0 で割ることはできません。");
                    } else {
                        printResult(divide(first, second));
                    }
                    break;
                default:
                    System.out.println("無効な選択です。");
            }

            System.out.print("\nもう一度計算しますか？ (y/n):");
            String again = scanner.next();

            if (!again.equalsIgnoreCase("y")) {
                System.out.println("終了。お疲れ様");
                break;
            }

            System.out.println();

        }

        scanner.close();
    }

    // 結果を出力するメソッド
    private static void printResult(int result) {
        System.out.println("結果: " + result);
    }

    // 足し算
    public static int add(int a, int b) {
        return a + b;
    }

    // 引き算
    public static int subtract(int a, int b) {
        return a - b;
    }

    // 掛け算
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 割り算
    public static int divide(int a, int b) {
        return a / b;
    }
}
