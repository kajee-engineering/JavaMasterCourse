package Section7_OOP_Part1_Inheritance.ClassPart1.src;

public class Main {

    public static void main(String[] args) {
        // オブジェクトを生成するコードでは私の Car クラスで有効だと定義していないメーカーを割り当てることはない
        // これはカプセル化のコンセプトでもある
        // Car car = null;  >> car.setMake() で NullPointerException が発生する >> コンパイルエラーにならない
        Car car = new Car();
        car.setMake("matseatati");
        car.setColor("Black");
        car.setConvertible(true);
        car.setDoors(2);
        car.setModel("Cayman");
        System.out.println("Model = " + car.getModel());
        System.out.println("Make= " + car.getMake());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setColor("red");
        targa.setConvertible(false);
        targa.setDoors(2);
        targa.setModel("Targa");
        System.out.println("Model = " + car.getModel());
        System.out.println("Make= " + car.getMake());
        car.describeCar();

        // 値の設定を一つずつ定義していて良いコードとは言えない
    }
}
