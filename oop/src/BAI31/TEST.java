package BAI31;

import java.util.Scanner;

public class TEST {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        MyComplex c1 = new MyComplex(real1, imag1);
        
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        MyComplex c2 = new MyComplex(real2, imag2);
        
        scanner.close();
        
        System.out.println("\nNumber 1 is: " + c1);
        System.out.println(c1 + " is " + (c1.isReal() ? "a pure real number" : "NOT a pure real number"));
        System.out.println(c1 + " is " + (c1.isImaginary() ? "a pure imaginary number" : "NOT a pure imaginary number"));
        
        System.out.println("\nNumber 2 is: " + c2);
        System.out.println(c2 + " is " + (c2.isReal() ? "a pure real number" : "NOT a pure real number"));
        System.out.println(c2 + " is " + (c2.isImaginary() ? "a pure imaginary number" : "NOT a pure imaginary number"));
        
        System.out.println("\n" + c1 + " is " + (c1.equals(c2) ? "equal to" : "NOT equal to") + " " + c2);
        
        MyComplex sum = c1.addNew(c2);
        System.out.println(c1 + " + " + c2 + " = " + sum);
    }
}


