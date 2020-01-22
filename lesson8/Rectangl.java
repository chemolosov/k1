package lesson8;


import java.util.Objects;

public class Rectangl extends Shape {
    private int x1, y2, x3, y4;

    public Rectangl(String color, int x1, int y2, int x3, int y4) {
        super(color);
        this.x1 = x1;
        this.y2 = y2;
        this.x3 = x3;
        this.y4 = y4;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY4() {
        return y4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }

    @Override
    public void draw() { System.out.println(" Drawing circle with" + getX1() + getX3() + getY2() + getY4());

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangl rectangl = (Rectangl) o;
        return x1 == rectangl.x1 &&
                y2 == rectangl.y2 &&
                x3 == rectangl.x3 &&
                y4 == rectangl.y4;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x1, y2, x3, y4);
    }

    @Override
    public String toString() {
        return "Rectangl{" +
                "x1=" + x1 +
                ", y2=" + y2 +
                ", x3=" + x3 +
                ", y4=" + y4 +
                "} " + super.toString();
    }
}
