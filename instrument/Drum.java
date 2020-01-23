package instrument;

public class Drum implements Instrument {

    public int size;

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("играет барабан с размером  " + getSize());

    }

}
