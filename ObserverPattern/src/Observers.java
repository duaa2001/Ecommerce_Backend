public interface Observers {

    //observers will need to know what the item is and whether it was added or not
    //observers will also be notified of a discount
    boolean notify(Item item, Boolean add);
    void display(int discount);
}
