package lesson9;

import java.util.Objects;

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Printing book");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
