import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ObserverUnitTestt {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    //Declare outContent to compare what is actually displayed to expected message
    @Test
    void itemTest() {
        System.setOut(new PrintStream(outContent));
        InStock inStock = new InStock();
        Item item1= new Item("Red Fur Coat", 121.00);
        Observers website = new Website();
        inStock.addListener(website);
        inStock.addItem(item1);
        assertTrue(inStock.itemList.contains(item1));
        inStock.removeItem(item1);
        assertFalse(inStock.itemList.contains(item1));
        assertTrue(outContent.toString().contains("Out of Stock"));
        //Checks if the item added appears in item list, and if it is no longer on the list when "removed"
        //When it is removed it also checks if the website displays an "Out of Stock" message
    }
    @Test
    void saleTest() {
   // ByteArrayOutputStream outContent = new ByteArrayOutputStream();
   System.setOut(new PrintStream(outContent));
    InStock inStock = new InStock();
    Website website = new Website();
    inStock.addListener(website);
    int discount = 20;
    inStock.sale(discount);
    assertTrue(outContent.toString().contains("" + discount));
    //Checks if the website message includes the value of discount that was expected to be passed in
}
}