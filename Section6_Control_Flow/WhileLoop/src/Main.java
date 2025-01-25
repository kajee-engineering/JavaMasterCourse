package Section6_Control_Flow.WhileLoop.src;

public class Main {
    public static void main(String[] args) {

    //     // while
    //     int j = 1;
    //     while (j <= 5) {
    //         System.out.println(j);
    //         j++;
    //     }
    //
    //     // do-while
    //     // ユーザがパスワードを入力する画面を想像してほしい
    //     // もし間違っていた場合は、認証情報の入力を求め続け、いつかは覚えてもらえるようにしたい。
    //     int k = 1;
    //     do {
    //         System.out.println(k);
    //         k ++;
    //     } while (k <= 5);

        int number = 0;
        while (number < 50) {
            number += 5;
            if ( number % 25 == 0) {
                continue;
            }
            System.out.println(number + "_)");
        }
    }
}