public class Main {
    public static void main(String[] args) {
        InStock inStock = new InStock();
        inStock.addListener(new Website());
        inStock.addItem(new Item ("Black Denim Jeans", 34.99));
        inStock.removeItem(new Item ("Red Fur Coat", 121.00));
        inStock.sale(20);
        inStock.addListener(new Email());
        inStock.sale(50);
    }
}