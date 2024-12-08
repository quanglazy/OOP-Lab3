package hust.soict.dsai.test.CartTest;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;
public class CartTest { public static void main(String[] args) {
Cart cart = new Cart();
//Create new dvd objects and add them to the cart
    // DVD 1: Một bộ phim hành động
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("Mad Max: Fury Road",
            "Action", 20.95f);
    cart.addDigitalVideoDisc(dvd1);

// DVD 2: Một bộ phim giả tưởng
    DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Hobbit",
            "Fantasy", 22.50f);
    cart.addDigitalVideoDisc(dvd2);

// DVD 3: Một bộ phim hài
    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Home Alone",
            "Comedy", 14.95f);
    cart.addDigitalVideoDisc(dvd3);

    cart.print();
    // Tìm kiếm DVD theo ID
    cart.searchByTitle("The Hobbit");  // Tìm DVD theo tiêu đề
    cart.searchById(1);
    cart.searchByTitle("hust");
    cart.searchById(4);


//To-do: Test the search methods here
}

    public static class StoreTest {
        public static void main(String[] args) {
            // Tạo cửa hàng với tối đa 5 DVD
            Store store = new Store(5);

            // Tạo các DVD mẫu
            DigitalVideoDisc dvd1 = new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 162, 22.99f);
            DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 19.99f);
            DigitalVideoDisc dvd3 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 24.99f);
            DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 18.99f);
            DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Matrix", "Science Fiction", "Lana and Lilly Wachowski", 136, 16.99f);


            // Thêm DVD vào cửa hàng
            store.addDVD(dvd1);
            store.addDVD(dvd2);
            store.addDVD(dvd3);
            store.addDVD(dvd4);
            store.addDVD(dvd5);

            // In ra tất cả DVD trong cửa hàng
            store.printItemsInStore();

            // Thử thêm một DVD khi cửa hàng đã đầy
            DigitalVideoDisc dvd6 = new DigitalVideoDisc("Shrek", "Animation", "Andrew Adamson", 90, 14.99f);
            store.addDVD(dvd6);  // Cửa hàng đã đầy nên DVD này không thể thêm vào

            // Xóa một DVD khỏi cửa hàng
            store.removeDVD(dvd2);
            store.removeDVD(dvd6);  // DVD này không có trong cửa hàng

            // In lại tất cả DVD trong cửa hàng
            store.printItemsInStore();
        }
    }
}