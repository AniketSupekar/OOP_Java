public class Inheritance1 {

    class Shape {
        String color;
    }

    class Triangle extends Shape {

    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.color = "red";
    }
}
