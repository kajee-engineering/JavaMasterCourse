package dev.lpa;

public class ProductA extends ProductForSale {

    public ProductA(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {

        System.out.println("This " + type + " is a beautiful reproduction");
        System.out.printf("The price of the price is $%6.2f %n", price);
        System.out.println(description);
    }

}
