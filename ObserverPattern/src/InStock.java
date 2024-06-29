import java.util.ArrayList;
import java.util.List;
public class InStock {
    public final List<Item> itemList = new ArrayList <>();
    //declare list of items
    private final List<Observers> listeners = new ArrayList <>();
    //declare list of observers


    //methods to add+remove listeners such as website and emails
    public void addListener(Observers listener) {
        listeners.add(listener);

    }
    public void removeListener(Observers listener) {
        listeners.remove(listener);
    }

    //methods to add+remove items to stock
//notify observers of the same
    public void addItem(Item item)
    {
        itemList.add(item);
        for(Observers observer:listeners)
            observer.notify(item,true);
    }
    public void removeItem(Item item)
    {
        itemList.remove(item);
        for(Observers observer:listeners)
            observer.notify(item,false);
    }
    // notify observers if there will be a sale and inform them of the discount
    public void sale (int discount) {
        for(Observers observer:listeners)
            observer.display(discount);
    }
}