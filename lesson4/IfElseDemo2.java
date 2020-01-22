package lesson4;

public class IfElseDemo2 {
    public static void main(String[] args) {
        if (args[0].equals("1")) {
            System.out.println("mon");
        } else if (args[0].equals("2")) {
            System.out.println("Tue");
        } else if (args[0].equals("3")) {
            System.out.println("Wen");
        } else if (args[0].equals("4")) {
            System.out.println("Thu");
        } else if (args[0].equals("5")) {
            System.out.println("Fri");
        } else if (args[0].equals("6")){
            System.out.println("Weekend");
        } else args[0].equals("8");
        {
            System.out.println("Wrong number!!!");
        }

    }
}
