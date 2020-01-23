package instrument;

public class Gitara implements Instrument {
    private int quantityStrings;

    public Gitara(int quantityStrings) {
        this.quantityStrings = quantityStrings;
    }

    public int getQuantityStrings() {
        return quantityStrings;
    }

    public void setQuantityStrings(int quantityStrings) {
        this.quantityStrings = quantityStrings;
    }

    @Override
    public void play() {
        System.out.println("количество струн " + getQuantityStrings());

    }


}