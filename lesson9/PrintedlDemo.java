package lesson9;

public class PrintedlDemo {
    public static void main(String[] args) {
        Book book1 = new Book("name1");
        Book book2 = new Book("name2");
        Megazin magazin1 = new Megazin("magazin1");
        Megazin megazin2 = new Megazin("magazin2");
        Printable[] printables = {book1, book2, magazin1, megazin2};
        for (Printable printable : printables) {
            printable.print();
        }
    }
}