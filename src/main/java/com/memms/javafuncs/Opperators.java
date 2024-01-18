package com.memms.javafuncs;

public class Opperators {
    public Opperators(){
        System.out.println("This is the Opperators class");
        System.out.println("Here you will find examples of opperators in Java");
    }

    public int addOne(int x) {
        int y = x;
        y++;
        return (y);
    }

    public int subtractOne(int x) {
        int y = x;
        y--;
        return y;
    }

    public boolean negate(boolean x) {
        return !x;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        System.out.println("NOTE: The division function returns an INT and not a double.");
        return x / y;
    }

    public int modulus(int x, int y) {
        System.out.println("NOTE: The modulus opperator (%) returns the remainder of the division");
        return x % y;
    }

    public int plusBy(int x, int y) {
        return x += y;
    }

    public int minusBy(int x, int y) {
        return x -= y;
    }

    public int multiplyBy(int x, int y) {
        return x *= y;
    }

    public int divideBy(int x, int y) {
        System.out.println("NOTE: The division function returns an INT and not a double.");
        return x /= y;
    }

    public int modulusBy(int x, int y) {
        return x %= y;
    }

    public int xorBy(int x, int y) {
        return x ^= y;
    }

    public boolean lessThan(int x, int y) {
        return x < y;
    }

    public boolean greaterThan(int x, int y) {
        return x > y;
    }

    public boolean lessThanOrEqual(int x, int y) {
        return x <= y;
    }

    public boolean greaterThanOrEqual(int x, int y) {
        return x >= y;
    }

    public boolean equal(int x, int y) {
        return x == y;
    }

    public boolean notEqual(int x, int y) {
        return x != y;
    }

    public boolean and(boolean x, boolean y) {
        return x && y;
    }

    public boolean or(boolean x, boolean y) {
        return x || y;
    }

    public int terenaryMax(int x, int y) {
        return (x > y) ? x : y;
    }

    public int bitwiseAnd(int x, int y) {
        return x & y;
    }

    public int bitwiseOr(int x, int y) {
        return x | y;
    }

    public int bitwiseXor(int x, int y) {
        return x ^ y;
    }

    public int bitwiseComplement(int x) {
        return ~x;
    }

    public int bitwiseLeftShift(int x, int y) {
        return x << y;
    }

    public int bitwiseRightShift(int x, int y) {
        return x >> y;
    }

    public int bitwiseZeroFillRightShift(int x, int y) {
        return x >>> y;
    }

}
