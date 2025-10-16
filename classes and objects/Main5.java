//create multiple objects of a class and call their methods.

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        System.out.println(c1.add(3, 4)); // 7
        System.out.println(c2.add(10, 20)); // 30
    }
}
