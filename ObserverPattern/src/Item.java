public class Item implements BaseItem {
    private String name;
    private double price;     // Item will be identified by its name and price
    public Item (String name, double price) {
        this.name= name;
        this.price= price;
    }
    //add getter and setters for both
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name =name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void setPrice(double price) {
        this.price =price;
    }
}