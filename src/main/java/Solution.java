// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    private int numerator;
    private int denominator;

    /**
     * Tinh GCD.
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return Math.abs(a);
    }

    /**
     * Constructor.
     */
    public Solution() {
        this.numerator = 0;
        this.denominator = 1;
    }

    /**
     * Constructor.
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (this.denominator == 0) {
            this.numerator = 0;
            this.denominator = 1;
        }
    }

    /**
     * Getter.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Getter.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Setter.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Setter.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * Reduce.
     */
    public Solution reduce() {
        int n = gcd(numerator, denominator);
        this.numerator /= n;
        this.denominator /= n;
        return this;
    }

    /**
     * Add.
     */
    public Solution add(Solution other) {
        this.numerator = this.numerator * other.getDenominator();
        this.numerator += this.denominator * other.getNumerator();
        this.denominator *= other.getDenominator();
        reduce();
        return this;
    }

    /**
     * Subtract.
     */
    public Solution subtract(Solution other) {
        this.numerator = this.numerator * other.getDenominator();
        this.numerator -= this.denominator * other.getNumerator();
        this.denominator *= other.getDenominator();
        reduce();
        return this;
    }

    /**
     * Multiply.
     */
    public Solution multiply(Solution other) {
        this.numerator *= other.getNumerator();
        this.denominator *= other.getDenominator();
        reduce();
        return this;
    }

    /**
     * Divide.
     */
    public Solution divide(Solution other) {
        if (other.getNumerator() != 0) {
            this.numerator *= other.getDenominator();
            this.denominator *= other.getNumerator();
            reduce();
        }
        return this;
    }

    /**
     * Check equals.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            if (numerator * other.getDenominator() == denominator * other.getNumerator()) {
                return true;
            }
            return false;
        }
        return false;
    }

}