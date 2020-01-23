package instrument;

public class InstrumentDemo {
    public static void main(String[] args) {
        Gitara gitara = new Gitara(6);
        Drum drum = new Drum(15);
        Trumpet trumpet = new Trumpet(3.5);
        Instrument[] instruments = {gitara, trumpet, drum};
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
