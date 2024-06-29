  public class Email implements Observers {
    //There may be multiple emails due to multiple customers.
      @Override
      public boolean notify(Item item, Boolean add) {
          //display the following messages
          System.out.println("Email Notification");
          System.out.println(item.getName() + "=" + item.getPrice());
          if (add == true)
              System.out.println("In Stock");
          else System.out.println("Out of Stock");
          return false;
      }
      @Override
      public void display(int discount) {
          //send a message with the discount that was passed in
          System.out.println("New Email Notification");
          System.out.println("Exciting Offer: "+discount+"% OFF Just For You!");
      }
  }



