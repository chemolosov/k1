package lesson5;

public class Gerlanda2 {
    public static void main(String[] agrs) {
        int y = 6;
        int gerlanda = 30;
        System.out.println("Gerlanda" + Integer.toBinaryString(gerlanda));
        firstOnOrOff(gerlanda);
        blinkAction(gerlanda);
        runString(gerlanda,y);
        switch (2) {
            case 1:
                System.out.println("firstOnOrOff");
                break;
            case 2:
                System.out.println("blinkAction");
                break;
            case 3:
                System.out.println("runString");
                break;
            default:
                System.out.println("Неправильно введено число");
                break;
        }
    }

    private static void runString(int gerlanda, int y) {
        int g = gerlanda & y;
        if (g == 1) {
            System.out.println("Лампочка включаеться в одном положение " + g);
        } else if (g == 0) {
            System.out.println("Лампочка выключаеться в другом положеие " + g);
        }

    }

    private static void blinkAction(int gerlanda) {
        int g = gerlanda << 1;
        System.out.println("Switch On" + Integer.toBinaryString(g));
    }

    private static void firstOnOrOff(int gerlanda) {
        int g = ~gerlanda;
        System.out.println("Switch Off" + Integer.toBinaryString(g));
    }
}


