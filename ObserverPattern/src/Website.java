public class Website implements Observers {
    @Override
    public boolean notify(Item item, Boolean add) {
        //item and whether it was added or not, is passed into the method

        System.out.println("Website Update");    //alert for an update
        System.out.println(item.getName() + "=" + item.getPrice());
        if (add == true)
            System.out.println("In Stock");        //display these messages
        else System.out.println("Out of Stock");
        return false;
    }

    public void display(int discount) {
        //display message with whatever the given discount is
        System.out.println("Website Update");
        System.out.println("Exciting Offer:"+discount+"% OFF");
    }
}

