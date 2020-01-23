package lesson4;

public class Average {
    public static void main(String[] args) {
        double average;
        double ferst = Double.parseDouble(args[0]);
        double second = Double.parseDouble(args[1]);
        double third = Double.parseDouble(args[2]);
        average = (ferst + second + third) / 3;
        System.out.println(average);
    }
}

