public class Entry {
    private int a;
    private int b;

    public long sum(int a, int b) {
        return a + b;
    }

    public float div(int a, int b) {
        return a / b;
    }

    public double pow(int a, int b) {
        double res = 0;
        int count = b;
                for ( ; b < count ; b++) {
            res *= a;
        }
        return res;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int minus(int a, int b) {
        return a - b;
    }


    public static void main (String[] args){
        int a = 4;
        int b = 2;
        double result = 0;
        Entry calc = new Entry();
        result = calc.sum (a, b);
        System.out.println("Result: "+result);
    }
}