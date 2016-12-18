import java.util.Scanner;

/**
 * In dieser Klasse werden die Bedingten Anweisungen der Programmiersprache demonstriert.
 */
public class BedingteAnweisungen {

    public static void main(String... args) {
        switchBeispiel();
        ifBeispiel();
    }

    /**
     * In dieser Methode wird durch einen {@link LogischeAusdrücke logischen Ausdruck} überprüft, ob der Benutzer ein Mensch ist.
     */
    private static void ifBeispiel() {
        System.out.println("Bist du ein Mensch? (J/N)");
        Scanner sc = new Scanner(System.in);
        char human = sc.next().charAt(0);
        if (human == 'J' || human == 'j') {
            System.out.println("Alles andere wäre sehr beunruhigend gewesen.");
        }
    }

    /**
     * In dieser Methode sollen 6 und 3 entweder addiert, subtrahiert, multipliziert oder dividiert.
     * Der Nutzer kann die Rechenart auswählen, indem er '+', '-', '*' oder '/' eingibt.
     */
    private static void switchBeispiel() {
        int ans;
        char operator;
        Scanner sc = new Scanner(System.in);
        operator = sc.nextLine().charAt(0);
        switch (operator) {
            case '+':
                ans = 6 + 3;
                break;
            case '-':
                ans = 6 - 3;
                break;
            case '*':
                ans = 6 * 3;
                break;
            case '/':
                ans = 6 / 3;
                break;
            default:
                ans = -1;
        }
    }
}
