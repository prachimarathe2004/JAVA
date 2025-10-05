class Student {
    String name;
    int marks1;
    int marks2;

    void calculateTotal() {
        int total = marks1 + marks2;
        System.out.println(name + "'s Total Marks: " + total);
    }

    void calculateAverage() {
        double avg = (marks1 + marks2) / 2.0;
        System.out.println(name + "'s Average Marks: " + avg);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Prachi";
        s1.marks1 = 85;
        s1.marks2 = 90;
        s1.calculateTotal();
        s1.calculateAverage();

        Student s2 = new Student();
        s2.name = "Riya";
        s2.marks1 = 78;
        s2.marks2 = 88;
        s2.calculateTotal();
        s2.calculateAverage();
    }
}
