// Write a program in JAVA to perform following operations on complex numbers Add, Subtract, Multiply, Divide.

public class exp10 {
    double real, imaginary;

    public Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    public Complex add(Complex c) {
        return new Complex(real + c.real, imaginary + c.imaginary);
    }

    public Complex subtract(Complex c) {
        return new Complex(real - c.real, imaginary - c.imaginary);
    }

    public Complex multiply(Complex c) {
        double r = real * c.real - imaginary * c.imaginary;
        double i = real * c.imaginary + imaginary * c.real;
        return new Complex(r, i);
    }

    public Complex divide(Complex c) {
        double r = (real * c.real + imaginary * c.imaginary) / (c.real * c.real + c.imaginary * c.imaginary);
        double i = (imaginary * c.real - real * c.imaginary) / (c.real * c.real + c.imaginary * c.imaginary);
        return new Complex(r, i);
    }

    public void display() {
        if (imaginary >= 0)
            System.out.println(real + " + " + imaginary + "i");
        else
            System.out.println(real + " - " + (-imaginary) + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 7);

        System.out.print("c1 = ");
        c1.display();

        System.out.print("c2 = ");
        c2.display();

        Complex sum = c1.add(c2);
        System.out.print("Sum of c1 and c2 = ");
        sum.display();

        Complex difference = c1.subtract(c2);
        System.out.print("Difference of c1 and c2 = ");
        difference.display();

        Complex product = c1.multiply(c2);
        System.out.print("Product of c1 and c2 = ");
        product.display();

        Complex quotient = c1.divide(c2);
        System.out.print("Quotient of c1 and c2 = ");
        quotient.display();
    }
    
}
