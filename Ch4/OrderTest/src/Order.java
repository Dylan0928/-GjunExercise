
public class Order {

    public double totalPrice = 0.0; // Default total price for order
    public Shirt[] shirts = new Shirt[5];
    public int itemNum = 0;

    public double addShirt(Shirt shirt) {
        if (itemNum < 5) {
            shirts[itemNum++] = shirt;
            totalPrice = totalPrice + shirt.price;
        }
        return totalPrice;
    }

    public void displayOrderInfo() {
        System.out.println("=====訂單資訊=====");
        System.out.println("訂單內容:");
        for (int i = 0; i < itemNum; i++) {
            shirts[i].display();
        }
        System.out.println("-----------------");
        System.out.println("總價: " + totalPrice);
    }
} // end of class




