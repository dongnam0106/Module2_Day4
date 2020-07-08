package QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    double delta;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        delta = b * b - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        return (-b+Math.pow((b*b - 4*a*c),0.5))/(2*a);
    }

    public double getRoot2() {
        return (-b-Math.pow((b*b - 4*a*c),0.5))/(2*a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a:");
        double a = sc.nextDouble();
        System.out.println("Input b:");
        double b = sc.nextDouble();
        System.out.println("Input c:");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        quadraticEquation.getDiscriminant();
        double d = quadraticEquation.delta;
        if (d > 0){
            System.out.println("Root 1: " + quadraticEquation.getRoot1());
            System.out.println("Root 2: " + quadraticEquation.getRoot2());
        } else if (d == 0){
            System.out.println("Root 1: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
