public class Triangulo {
    private double A;
    private double B;
    private double C;

    public Triangulo() {

    }
    public Triangulo(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double getA() {
        return A;
    }
    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }
    public void setB(double b) {
        B = b;
    }

    public double getC() {
        return C;
    }
    public void setC(double c) {
        C = c;
    }

    public double cacularArea(){
        double p = (A + B + C) / 2;
        return Math.sqrt(p *(p - A)*(p - B)*(p - C));
    }
}
