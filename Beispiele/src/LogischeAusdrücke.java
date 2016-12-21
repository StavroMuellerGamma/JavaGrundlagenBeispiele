/**
 * In dieser Klasse werden logische Ausdrücke der Programmiersprache Java demonstriert.
 */
public class LogischeAusdrücke {
    public static void main(String... args) {
        booleanBeispiele();
        atomareDatentypenBeispiele();
    }

    private static void atomareDatentypenBeispiele() {
        int i = 0, j = 1;
        char c = 'a', d = 'b';
        boolean a;
        // int
        // Und
        a = (i == 0) && (j == 0);
        System.out.println("(i == 0) && (j == 0) ist " + a);
        // Oder
        a = (i == 0) || (j == 0);
        System.out.println("(i == 0) || (j == 0) ist " + a);
        // Gleichheit
        a = i == j;
        System.out.println("i == j ist " + a);
        // Ungleichheit
        a = i != j;
        System.out.println("i != j ist " + a);
        // Größer
        a = i > j;
        System.out.println("i > j ist " + a);
        // Kleiner
        a = i < j;
        System.out.println("i < j ist " + a);
        // Größer-Gleich
        a = i >= j;
        System.out.println("i >= j ist " + a);
        // Kleiner-Gleich
        a = i <= j;
        System.out.println("i <= j ist " + a);
        // char
        // Und
        a = (c == 'a') && (d == 'a');
        System.out.println("(c == 'a') && (d == 'a') ist " + a);
        // Oder
        a = (c == 'a') || (d == 'a');
        System.out.println("(c == 'a') || (d == 'a') ist " + a);
        // Gleichheit
        a = c == d;
        System.out.println("c == d ist " + a);
        // Ungleichheit
        a = c != d;
        System.out.println("c != d ist " + a);
        // Größer
        a = c > d;
        System.out.println("c > d ist " + a);
        // Kleiner
        a = c < d;
        System.out.println("c < d ist " + a);
        // Größer-Gleich
        a = c >= d;
        System.out.println("c >= d ist " + a);
        // Kleiner-Gleich
        a = c <= d;
        System.out.println("c <= d ist " + a);
    }

    /**
     * In dieser Methode werden die logischen Operationen von Booleans demonstriert.
     */
    private static void booleanBeispiele() {
        boolean a = true, b = false, c;
        // logisches Und
        c = a && b;
        System.out.println("a && b ist " + c);
        // logisches Oder
        c = a || b;
        System.out.println("a || b ist " + c);
        // Gleichheit
        c = a == b;
        System.out.println("a == b ist " + c);
        // Ungleichheit
        c = a != b;
        System.out.println("a != b ist " + c);
    }

}
