package Section5_Expressions_Statements_And_More.KeywordsAndExpressions.src;

// IDE で青色に表示されている文字は全て、予約語を示す。
public class Main {

    // コードを書くことは、文章を書くことと似ている。
    public static void main(String[] args) {
        // int int = 5; 予約後は変数名として使えない
        // int int2 = 5;

        double kilometers = (100 * 1.609344); // 型宣言で始まり、; で終わる。有効なJavaステートメントが出来上がる。

        int highScore = 50; // int や ; は式の一部ではないことを覚えてほしい

        if(highScore > 25) {
            highScore = 1000  + highScore; // add bonus points
        }

        int health = 100;

        // 2つの式を評価し, ブール値を返す(= 3つ目の式)
        if((health < 25)  // () は式に含まれない
                &&
                (highScore > 1000)) { // () は式に含まれない
            highScore = highScore - 1000; // highScore, highScore - 1000, ステートメントの3つの式がある.
        }
        System.out.println(highScore);
    }
}