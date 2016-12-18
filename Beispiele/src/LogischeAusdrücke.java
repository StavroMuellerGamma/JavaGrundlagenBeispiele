/**
 * In dieser Klasse werden logische Ausdrücke der Programmiersprache Java demonstriert.
 */
public class LogischeAusdrücke {
    public static void main(String... args) {
        booleanBeispiele();
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
