//Create a class Student with attributes name and marks. Use a constructor to initialize values and a method to display student info.


class Student {
    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }

    void display() {
        System.out.println(name + " scored " + marks + " marks");
    }
}

public class Main7 {
    public static void main(String[] args) {
        Student s1 = new Student("Prachi", 85);
        Student s2 = new Student("Roohi", 90);
        s1.display();
        s2.display();
    }
}
