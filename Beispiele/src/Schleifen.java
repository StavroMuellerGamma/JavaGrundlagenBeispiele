import java.util.Scanner;

/**
 * In dieser Klasse werden einfache Schleifen der Programmiersprache Java demonstriert.
 */
public class Schleifen {

    public static void main(String... args) {
        forBeispiel();
        whileBeispiel();
    }

    /**
     * In dieser Methode sollen die Zahlen von 1 bis 100 aufaddiert werden.
     */
    private static void forBeispiel() {
        int ans = 0;
        for (int i = 1; i <= 100; i++) {
            ans += i;
        }
    }

    /**
     * In dieser Methode wird die while-Schleife demonstriert.
     * Die while-Schleife ist nötig, da nicht klar ist, wann der Benutzer das Programm beenden möchte.
     * In der Schleife wird die Klassse {@link Scanner} verwndet, um die Eingabe des Benutzers zu lesen.
     * Falls der erste Buchstabe dieser Eingabe {@code N} oder {@code n} ist wird die Schleife beendet.
     */
    private static void whileBeispiel() {
        boolean end = false;
        Scanner sc = new Scanner(System.in);
        while (!end) {
            System.out.println("Sollen wir weiter machen? J/N");
            char answer = sc.next().charAt(0);
            if (answer == 'N' || answer =='n') {
                end = true;
            }
        }
    }
}
