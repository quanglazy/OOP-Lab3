package hust.soict.dsai.test.TestPassingParameter;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Nguyen Nhuan Quang 20225914  Jungle"); DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("Nguyen Nhuan Quang 20225914 jungle dvd title:" + jungleDVD.getTitle());
                System.out.println("Nguyen Nhuan Quang 20225914 cinderella dvd title: " + cinderellaDVD.getTitle());
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Nguyen Nhuan Quang 20225914 jungle dvd title: " + jungleDVD.getTitle());
    } public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
    public static void swap (Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

}