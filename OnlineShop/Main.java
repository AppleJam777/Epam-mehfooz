import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Run this file and enter the product name you want from the selection
        // when you have select the products simply press enter in the empty line.
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 10); // the format is ("Product",Price,Stock)
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);
        store.shop("John");
    }
}
