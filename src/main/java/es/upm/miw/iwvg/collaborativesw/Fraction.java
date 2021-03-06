package es.upm.miw.iwvg.collaborativesw;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction inverse() {
        return new Fraction(this.getDenominator(), this.getNumerator());
    }

    public Fraction multiply(Fraction multiplied){return new Fraction(numerator*multiplied.getNumerator(),denominator*multiplied.getDenominator());}

    public Fraction add(Fraction fraction) {
        assert fraction != null;

        int newNumerador = (this.numerator * fraction.getDenominator()) + (this.denominator * fraction.getNumerator());
        int newDenominador = (this.denominator * fraction.getDenominator());

        return new Fraction(newNumerador, newDenominador);

    }
}