package lesson7;


public class Aspirant extends Student {
    String work;

    public Aspirant(String firstName, String lastName, String grope, double avgMark, String work) {
        super(firstName, lastName, grope, avgMark);
        this.work = work;

    }
    public double getScholarship() {
        return avgMark == 5 ? 200 : 180;
    }
    public static void main(String[] args) {
        Student student = new Student("иван ", "петр ", "grope5", 3);
        Aspirant aspirant1 = new Aspirant("Вася", "василий ", "grope5 ", 5,
                "Work5");
        Student aspirant2 = new Aspirant("Вася4", "василий3 ", "grope55 ", 53,
                "Work44");
        Student[] students = {student, aspirant1, aspirant2};
        for (Student s : students){
            System.out.println(s.getScholarship());
        }
    }


}

