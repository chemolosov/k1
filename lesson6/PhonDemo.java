package lesson6;

public class PhonDemo {
    public static void main(String[] args) {
        Phone myPhone1 = new Phone();
                /*Phone myPhone2 = new Phone(+380453453, 5, "Nokia");
        Phone myPhone3 = new Phone(+39898, 7);*/

        myPhone1.setModel("apple");
        myPhone1.setWeight(4.5);
        myPhone1.setNamber("4353435");

        System.out.println(myPhone1.getNamber());
        System.out.println(myPhone1.getModel());
        System.out.println(myPhone1.getWeight());


        myPhone1.receiveColl("Mather");
        myPhone1.receiveColl("Father");
        myPhone1.receiveColl("Sister", "namber");

        System.out.println(myPhone1.getNamber());

       /* myPhone1.sendMessage("Message ", 34, 32, 12);
        myPhone1.sendMessage("Massage ", 36, 45, 43, 76);*/
        System.out.println(Phone.count);
    }
}

