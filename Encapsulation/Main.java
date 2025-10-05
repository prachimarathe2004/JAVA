class Student {
    private String name;  // private = data hiding
    private int age;

    // public getter and setter methods
    public void setName(String name) {
        this.name = name;   // 'this' refers to current object
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {       // adding validation logic
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Prachi");
        s1.setAge(21);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
