package Section7_OOP_Part1_Inheritance.ClassesChallenges.src;

public class Account {
    private int id;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String number;
    private String customerPhone;

    // Constructor
    // オブジェクトの生成
    // クラスと同じ名前のメソッド
    // new クラス() を入力すると暗黙的に呼び出される(＝デフォルトコンストラクタ）
    // クラスにコンストラクタの宣言がない場合、デフォルトのコンストラクタが暗黙的に宣言されます このコンストラクタはパラメータを持たないので、No args constructor と呼ばれます
    // クラスにコンストラクタの宣言がある場合、デフォルトのコンストラクタは暗黙のうちに宣言されません
    public Account() {
        // コンストラクタをチェインするために this を呼び出す
        // オーバーローディングしたコンストラクタが呼び出される
        this("56789", 2.50, "Default Name", "Default Addoress", "Default Phone");
        System.out.println("Empty constructor called");

        // 経験則「ゲッターやセッター、コンストラクタ以外(=this)のメソッドを呼び出さない」
    }

    // クラスのコンストラクタを複数持つことをオーバーローディングするという。
    public Account(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName; // this.customerName は パラメータ名を表す。customerName は フィールド名を表す。
        customerEmail = email; // フィールド名(email)とパラメータ名(customerEmail)が異なるのでthisは必要ありません。
        customerPhone = phone;
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("9999", 100.55, customerName, customerEmail, customerPhone);
        // this.customerName = customerName;
        // this.customerEmail = customerEmail;
        // this.customerPhone = customerPhone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    protected void depositFunds(int depositAmount) {
        this.balance += depositAmount;
        System.out.println("Depost of $ " + depositAmount + ". " + "New balance is = $ " + this.balance);
    }

    protected void withDraw(int money) {
        if (this.balance >= money) {
            System.out.println("Withdraw specified money [ $  " + money + " ] from your balance");
            this.balance -= money;
        } else {
            System.out.println("The specified money is missing...");
        }

        System.out.println("Result balance = $ " + this.balance);
    }
}
