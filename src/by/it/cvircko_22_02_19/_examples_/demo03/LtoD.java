package by.it.cvircko_22_02_19._examples_.demo03;

// Demonstate automatic conversion from long to double.
class LtoD {
    public static void main(String args[]) {
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L and D: " + L + " " + D);
    }
}