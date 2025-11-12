package Calculator;

import java.util.Scanner;

public class CalculatorApp5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("1つ目の整数を入力してください: ");
            int a = scanner.nextInt();

            System.out.print("2つ目の整数を入力してください: ");
            int b = scanner.nextInt();

            System.out.println("\n計算方法を選んでください:");
            System.out.println("1: 足し算");
            System.out.println("2: 引き算");
            System.out.println("3: 掛け算");
            System.out.println("4: 割り算");
            System.out.print("→ ");
            int choice = scanner.nextInt();

            int result = 0;
            boolean valid = true;
            switch (choice) {
                case 1:
                    result = add(a, b);
                    break;
                case 2:
                    result = subtract(a, b);
                    break;
                case 3:
                    result = multiply(a, b);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("エラー: 0 で割ることはできません。");
                        valid = false;
                    } else {
                        result = divide(a, b);
                    }
                    break;
                default:
                    System.out.println("無効な選択です。");
                    valid = false;
            }

            if (valid) {
                System.out.println("結果: " + result);
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
