package Section5_Expressions_Statements_And_More.LocalVariablesAndScope.src;

public class Main {

    public static void main(String[] args) {
        // main メソッドのコードブロックで有効な変数
        int firstVariable = 5;
        int secondVariable = 10;

        if (firstVariable > 0) {
            // mainブロックの内側にあるフロースーテートメントで参照できる
            // このアクセシビリティは可変スコープとも呼ばれる
            System.out.println(secondVariable);
        }
    }

    public static void aMethod(boolean aBoolean) {

        if (aBoolean) {
            // if ステートメントで宣言されたローカルスコープ変数は、そのブロックの外ではアクセスできない。
            int myCounter = 10;
        }
        // System.out.println(myCounter); // Cannot resolve sym,bol 'myCounter'
    }

    // 異なるブロックで変数を宣言する際の Scope Best Practices
    // 可能であれば同じ場所がベストプラクティス
    // 可能な限り狭いスコープで宣言
    // 例えば入れこで狭い範囲でしか使わないならそこで宣言すべきである
    // 例えばループブロックの外では使わない場合はループコードのの中か、forループの初期化ブロックの中で宣言します。
    //

    public static void bMethod(int value) {

        switch (value) {

            case 1:
                // System.out.println(i);
                break;
            case 2:
                    int i = 10;
            break;
        }
    }
}