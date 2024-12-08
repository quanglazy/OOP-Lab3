package hust.soict.dsai.aims;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;


public class Aims {
    public static void main(String[] args) {

        Cart anOrder = new Cart();

        // DVD 1: Một bộ phim hành động
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Avengers: Endgame", "Action", "Anthony and Joe Russo", 181, 29.99f);
        anOrder.addDigitalVideoDisc(dvd1);

// DVD 2: Một bộ phim hài
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Mask", "Comedy", "Chuck Russell", 101, 14.95f);
        anOrder.addDigitalVideoDisc(dvd2);

// DVD 3: Một bộ phim hoạt hình khác
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Finding Nemo", "Animation", "Andrew Stanton", 100, 19.95f);
        anOrder.addDigitalVideoDisc(dvd3);

        anOrder.addDigitalVideoDisc(dvd1,dvd2,dvd3);
        hust.soict.dsai.aims.disc.DigitalVideoDisc[] dv = {dvd1,dvd2,dvd3};
        anOrder.addDigitalVideoDisc(dv);


        System.out.println("Nguyen Nhuan Quang 20225914 Total Cost is: ");
        System.out.println("Nguyen Nhuan Quang 20225914 DVD 1 ID: " + dvd1.getId());  // Sẽ in: DVD 1 ID: 1
        System.out.println("Nguyen Nhuan Quang 20225914 DVD 2 ID: " + dvd2.getId());  // Sẽ in: DVD 2 ID: 2
        System.out.println("Nguyen Nhuan Quang 20225914 DVD 3 ID: " + dvd3.getId());  // Sẽ in: DVD 3 ID: 3

        System.out.println(anOrder.totalCost());
            anOrder.removeDigitalVideoDisc(dvd1);
            System.out.println(anOrder.totalCost());
        


    }
}
