package ss15_exception_debug.exercise;

public class Triangle extends Test {
    private double a, b, c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException(" canh ko duoc be hon hoac bang ko ");
        } else if (a + b < c || a + c < b || c + b < a) {
            throw new IllegalTriangleException(" tong 2 canh lon hon canh con lai");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void check(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException(" canh ko duoc be hon hoac bang ko ");
        } else if (a + b <= c || a + c <= b || c + b <= a) {
            throw new IllegalTriangleException(" tong 2 canh lon hon canh con lai");
        } else {
            setA(a);
            setB(b);
            setC(c);
        }
    }
}
