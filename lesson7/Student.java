package lesson7;

public class Student {
    String firstName, lastName, grope;
    double avgMark;

    public Student(String firstName, String lastName, String grope, double avgMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grope = grope;
        this.avgMark = avgMark;
    }

    public double getScholarship() {
        return avgMark == 5 ? 100 : 80;
    }

}
