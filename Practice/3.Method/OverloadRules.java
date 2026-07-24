public class OverloadRules {

    static void show(int a) {
        System.out.println("int version: " + a);
    }

    static void show(long a) {
        System.out.println("long version: " + a);
    }

    static void show(double a) {
        System.out.println("double version: " + a);
    }

    public static void main(String[] args) {

        // (i) Exact signature match
        int x = 10;
        show(x);          // calls show(int) — exact match found

        // (ii) Type promotion (widening)
        byte b = 5;
        show(b);          // no show(byte) exists → byte widens to int → calls show(int)

        short s = 20;
        show(s);          // no show(short) → widens to int → calls show(int)

        char c = 'A';
        show(c);          // no show(char) → widens to int → calls show(int)  (prints 65)

        float f = 3.5f;
        show(f);          // no show(float) → widens to double → calls show(double)
    }
}