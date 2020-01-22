package lesson5;

public class SwitchDemo {
    public static void main(String[] args) {
        switch (args[0]) {
            case "1":
                System.out.println("Mon");
                break;
            case "2":
                System.out.println("Twe");
                break;

            case "3":
                System.out.println("Thu");
                break;
            case "4":
                System.out.println("Wed");
                break;
            case "5":
                System.out.println("Fri");
                break;
            case "6":
            case "7":
                System.out.println(("Wecand"));
                break;
            default:
                System.out.println("Wrong value");
        }
    }
}