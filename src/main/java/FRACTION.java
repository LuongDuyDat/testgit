// Import your library
// Do not change the name of the Solution class
public class FRACTION {
    // Type your main code here
    private int numerator;
    private int denominator;

    /** Tinh GCD. */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return Math.abs(a);
    }

    /** Constructor. */
    public FRACTION(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /** Getter. */
    public int getNumerator() {
        return numerator;
    }

    /** Getter. */
    public int getDenominator() {
        return denominator;
    }

    /** Setter. */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /** Setter. */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /** Reduce. */
    public void reduce() {
        int n = gcd(numerator, denominator);
        numerator /= n;
        denominator /= n;
    }

    /** Add. */
    public void add(FRACTION other) {
        this.numerator = this.numerator * other.denominator + this.denominator * other.numerator;
        this.denominator *= other.denominator;
        reduce();
    }

    /** Subtract. */
    public void subtract(FRACTION other) {
        this.numerator = this.numerator * other.denominator - this.denominator * other.numerator;
        this.denominator *= other.denominator;
        reduce();
    }

    /** Multiply. */
    public void multiply(FRACTION other) {
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
        reduce();
    }

    /** Divide. */
    public void divide(FRACTION other) {
        this.numerator *= other.denominator;
        this.denominator *= other.numerator;
        reduce();
    }

    /** Check equals. */
    public boolean equals(Object obj) {
        if (obj instanceof FRACTION) {
            FRACTION other = (FRACTION) obj;
            if (this.numerator * other.denominator == this.denominator * other.numerator) {
                return true;
            }
            return false;
        }
        return false;
    }

}