package instrument;

public class Trumpet implements Instrument {
    public double diameter;

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play () {
        System.out.println("играют на трубе с деаметром "+ getDiameter());

    }
}
