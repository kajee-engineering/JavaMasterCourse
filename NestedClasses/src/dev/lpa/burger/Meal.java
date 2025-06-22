package dev.lpa.burger;

import java.util.ArrayList;
import java.util.List;

// 入れ子クラスのメリットの1つに内側と外側のクラスの両方が相手のインスタンスメンバーに直接アクセスできる
// クラス内部でコンポジションを構築するためにインナークラスを使用する方法が理にかなっている場合を表現するでデモである。
// ネストされたクラスは内部クラスに多くの機能を持たせることができるようになる。
public class Meal {

    private double price = 5.0;

    // ItemからBurgerへ
    private Burger burger;
    private Item drink;
    private Item side;

    private double conversionRate;

    public Meal() {
        this(1);
    }

    public Meal(double conversionRate) {
        this.conversionRate = conversionRate; // インスタンスのプロパティに引数を追加する
        burger = new Burger("regular");
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name); // ゲッターなしに直接クラスメンバにアクセスできる。コンパイルエラーが発生せずプリントアウトできることを確認する
        side = new Item("fries", "side", 2.0);
    }

    public double getTotal() {
        double total = burger.getPrice() + drink.price + side.price;
        return Item.getPrice(total, conversionRate);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side,
                "Total Due: " , getTotal());
    }

    public void addToppings(String... selectedToppings) {
        // burgerインスタンスにトッピング追加の仕事を委ねる
        burger.addToppings(selectedToppings);
    }

    private class Item {

        private String name;
        private String type;
        private double price;

        public Item(String name, String type) {
            this(name, type, type.equals("burger") ? Meal.this.price : 0); // 3つの引数を受け取るコンストラクタを呼びだす
        }
        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(name, type,
                    getPrice(price, conversionRate));
        }

        private static double getPrice(double price, double rate) {
            return price * rate;
        }
    }


    // お店限定の商品がある場合もあるのでトッピングを追加して他のメニューと一緒にプリントアウトする
    private class Burger extends Item {

        static // JDK16以前は静的定数(==static final フィールド)以外は含められないためコンパイルエラーになる
        private enum Extra {AVOCADO, BACON, CHEESE, KETCHUP, MAYO, MUSTARD, PICKLES;

            private double getPrice() {
                return switch (this) {
                    case AVOCADO -> 1.0;
                    case BACON, CHEESE -> 1.5;
                    default -> 0;
                };
            }
        }

        private List<Item> toppings = new ArrayList<Item>();
        private Burger(String name) {
            super(name, "burger", 5.0);
        }

        // MealクラスのburgerプロパティからpriceMeal.Item.priceにアクセスできないのでゲッターを定義する
        // double total = burger.price + drink.price + side.price;
        public double getPrice() {

            double total = super.price; // double total = price; はMeal.priceの価格が変わる場合がある
            for (Item topping : toppings) {
                total += topping.price;
            }
            return total;
        }

        private void addToppings(String... selectedToppings) {

            try {
                for (String selectedTopping : selectedToppings) {
                    Extra topping = Extra.valueOf(selectedTopping.toUpperCase());
                    toppings.add(new Item(topping.name(), "TOPPING",
                            topping.getPrice()) // ネストされた内部の列挙型クラスにも接続できる
                    );
                }
            } catch (IllegalArgumentException ie) {
                System.out.println("No topping found for " + selectedToppings);
            }
        }

        @Override
        public String toString() {

            StringBuilder itemized = new StringBuilder(super.toString()); // 複数のトッピングを追加するためにStringBuilder

            for (Item topping : toppings) {
                itemized.append("\n");
                itemized.append(topping);
            }
            return itemized.toString();
        }
    }


}
