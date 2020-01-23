package lesson9;

import java.util.Objects;

public class Megazin implements Printable {
    private String magazin;

    public Megazin(String magazin) {
        this.magazin = magazin;
    }

    public String getMagazin() {
        return magazin;
    }

    public void setMagazin(String magazin) {
        this.magazin = magazin;
    }

    @Override
    public void print() {
        System.out.println("printing magasin");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Megazin megazin = (Megazin) o;
        return Objects.equals(magazin, megazin.magazin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(magazin);
    }
}
