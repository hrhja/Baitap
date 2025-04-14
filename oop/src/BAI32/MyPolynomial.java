package BAI32;

import java.util.Arrays;

public class MyPolynomial {
private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = Arrays.copyOf(coeffs, coeffs.length);
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = getDegree(); i >= 0; i--) {
            if (i != getDegree()) sb.append(" + ");
            sb.append(coeffs[i]).append("x^").append(i);
        }
        return sb.toString();
    }

    public double evaluate(double x) {
        double result = 0.0;
        for (int i = 0; i <= getDegree(); i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial another) {
        int maxDegree = Math.max(this.getDegree(), another.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double c1 = (i <= this.getDegree()) ? this.coeffs[i] : 0;
            double c2 = (i <= another.getDegree()) ? another.coeffs[i] : 0;
            newCoeffs[i] = c1 + c2;
        }

        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial another) {
        int newDegree = this.getDegree() + another.getDegree();
        double[] newCoeffs = new double[newDegree + 1];
        Arrays.fill(newCoeffs, 0);

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= another.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * another.coeffs[j];
            }
        }

        return new MyPolynomial(newCoeffs);
    }
}

