package dev.lpa;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return quantity * price;
    };

    public void printPricedItem(int quantity) {
        System.out.printf("%2d quantity $%8.2f each, %-15s %-35s %n", quantity, price, type, description);
    }

    abstract void showDetails();

}


