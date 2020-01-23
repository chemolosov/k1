package market;


import java.util.Arrays;

public class Basket {
    private String nameCotegori;
    private Product[] massProduct;

    public Basket(String nameCotegori, Product[] massProduct) {
        this.nameCotegori = nameCotegori;
        this.massProduct = massProduct;
    }

    public String getNameCotegori() {
        return nameCotegori;
    }

    public void setNameCotegori(String nameCotegori) {
        this.nameCotegori = nameCotegori;
    }

    public Product[] getMassProduct() {
        return massProduct;
    }

    public void setMassProduct(Product[] massProduct) {
        this.massProduct = massProduct;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "nameCotegori='" + nameCotegori + '\'' +
                ", massProduct=" + Arrays.toString(massProduct) +
                '}';
    }
}
