package Section4_IntelIIJ_Basics.HelloWorld.src;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = true;
        // if-then statement
        if (isAlien == false) {  // = と == は全く別の意味を持つ
            System.out.println("It is not an alien!");
        } // コードブロックの終了
        System.out.println("And I am scared of aliens");

        if(isAlien == true)
            // コードブロックなしでも動作する
            System.out.println("I am alien!");

        int topScore = 100;
        // if (topScore != 100) { // not equals
        // if (topScore >= 100) { // >(grater than) and =(equal to)
        if (topScore < 100) { // <(less than)
             System.out.println("You got the high score!");
        }
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) { // extended ()
            System.out.println("Greater than second top score and less than top score");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50; // 代入演算子
        // if (newValue = 50) {
        //     System.out.println("This is an error");
        if (newValue == 50) { // 符号演算子 equal to
            System.out.println("This is not error, true");
        }
        boolean isCar = false;
        // if(isCar = true) { // 値の再代入によってtrueを判定する
        // if(isCar == true) { // 必ず equals to を使う
        // if(isCar) { // isCar == true と一緒
        if(! isCar) { // isCar == false と一緒
            System.out.println("This is not supposed to happen");
        }

        //
        // 三項演算子
        //
        // operand1 ? operand2 : operand3
        String makeOfCar = "Volkswagen";
        // boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true; // 三項演算子
        boolean isDomestic = (makeOfCar != "Volkswagen"); // 同じ意味
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }
        String s = (isDomestic) ? "This car is domestic to our country" : "This car is not domestic to our country";
        System.out.println("ternary result = " + s);

       double myDoubleValue = 20.00d;
       double mySecondDoubleValue = 80.00d;
       double bothNumber = ((myDoubleValue + mySecondDoubleValue) % 20.00d);
       boolean isNotRemainder = (bothNumber == 0 ? true : false);

       System.out.println("total is " + bothNumber);
        System.out.println("not remainder is " + isNotRemainder);

       if (! isNotRemainder ) {
           System.out.println("got some remainder");
       }





























































    }
}
