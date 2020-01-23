package market;

public class Product {
    private String nameProduct;
    private double costProduct;
    private double ratingProduct;

    public Product(String nameProduct, double costProduct, double ratingProduct) {
        this.nameProduct = nameProduct;
        this.costProduct = costProduct;
        this.ratingProduct = ratingProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getCostProduct() {
        return costProduct;
    }

    public void setCostProduct(double costProduct) {
        this.costProduct = costProduct;
    }

    public double getRatingProduct() {
        return ratingProduct;
    }

    public void setRatingProduct(double ratingProduct) {
        this.ratingProduct = ratingProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", costProduct=" + costProduct +
                ", ratingProduct=" + ratingProduct +
                '}';
    }
}
