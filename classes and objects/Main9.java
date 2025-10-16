//Write a program to calculate the area of a rectangle using a class Rectangle with methods setDimensions() and calculateArea().


class Rectangle {
    int length, breadth;

    void setDimensions(int l, int b) {
        length = l;
        breadth = b;
    }

    int calculateArea() {
        return length * breadth;
    }
}

public class Main9 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setDimensions(5, 10);
        System.out.println("Area: " + r.calculateArea());
    }
}
