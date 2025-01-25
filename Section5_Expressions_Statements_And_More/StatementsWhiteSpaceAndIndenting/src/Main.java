package Section5_Expressions_Statements_And_More.StatementsWhiteSpaceAndIndenting.src;

public class Main {

    public static void main(String[] args) {

        int myVariable = 80; // 型宣言からセミコロンまでがステートメント

        myVariable++; // これもステートメント
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is" // 行を終わらせようとしていないので
                + " another"
                + " still more."); // これも一つのステートメント

        if (myVariable == 0) {
            System.out.println("It's my Value");
        }
    }
}