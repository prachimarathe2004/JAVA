class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    void showIncrement() {
        double newSalary = salary + (salary * 0.10);
        System.out.println(name + "'s updated salary: " + newSalary);
    }
}

public class Main10 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Prachi", 50000);
        e1.showIncrement();
    }
}
 
