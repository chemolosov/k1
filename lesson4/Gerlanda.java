package lesson4;

public class Gerlanda {
    public static void main(String[] agrs) {
        int y = 1;
        int gerlanda = 30;
        System.out.println("Gerlanda" + Integer.toBinaryString(gerlanda));
        firstOnOrOff(gerlanda,y);
        blinkAction(gerlanda);
        runString(gerlanda);
    }

    private static void firstOnOrOff(int gerlanda, int y) {
        int g = gerlanda & y;
        if (g == 1) {
            System.out.println("Лампочка включаеться в одном положение " + g);
        } else if (g == 0) {
            System.out.println("Лампочка выключаеться в другом положеие " + g);
        }

    }
    private static void blinkAction ( int gerlanda){
        int g = gerlanda << 1;
        System.out.println("Switch On" + Integer.toBinaryString(g));
    }

    private static void runString ( int gerlanda){
        int g = ~gerlanda;
        System.out.println("Switch Off" + Integer.toBinaryString(g));
    }
}
