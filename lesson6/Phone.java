package lesson6;

public class Phone {
    static int count;

    private String namber;
    private double weight;
    private String model;


    Phone() {
        count++;
    }

    public Phone(String namber, double weight, String model) {
        this.namber = namber;
        this.weight = weight;
        this.model = model;
    }

    public Phone(String namber, double weight) {
        this.namber = namber;
        this.weight = weight;
    }


    void receiveColl(String name) {
        System.out.println(name + " Is calling on my phone number " + namber);
    }

    void receiveColl(String name, String namber) {
        System.out.println(name + "with number" + " Is calling on my phone number " + namber);
    }

    public String getNamber() {
        return namber;
    }

    public void setNamber(String namber) {
        this.namber = namber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
/* void sendMessage(String... messege, String... nambers) {
        System.out.println("Send messeg " + messege + "to phone ");
        for (String namber : nambers) {
            System.out.println(namber);

        }
    }*/

}
