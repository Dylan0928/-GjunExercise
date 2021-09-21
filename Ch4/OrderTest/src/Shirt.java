public class Shirt {

    public int shirtID = 0; // Default ID for the shirt
    public String description = "-description required-"; // default  
    // The color codes are R=Red, B=Blue, G=Green, U=Unset
    public char colorCode = 'U';
    public double price = 0.0; // Default price for all items

    // This method displays the values for an item
    public void display() {
        System.out.println("---衣服資訊---");
        System.out.println("編號: " + shirtID);
        System.out.println("說明: " + description);
        System.out.println("顏色: " + colorCode);
        System.out.println("價格: " + price);
    } // end of display method
} // end of class
