package Section7_OOP_Part1_Inheritance.ClassesChallenges.src;

public class Main {
    public static void main(String[] args) {

        Account bobsAccount = new Account("bob", "bob@email.com", "12345");


        // Account account =  new Account(
        //         "12345", 100.0, "tom", "xxx@mail.com", "(087) 123-2345"
        // );

        // コンストラクタを使わない方法では属性の値を一つずつ設定する
        // myAccount.setBalance(1000);
        // myAccount.setCustomerEmail("xxx@mail.com");
        // myAccount.setId(12345);
        // myAccount.setName("tom");
        //
        // myAccount.depositFunds(1000);
        // myAccount.withDraw(100);
        // System.out.println(myAccount.toString());
        // myAccount.withDraw(901);
        // System.out.println(myAccount.toString());


    }
}