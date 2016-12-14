import java.util.Scanner;

/**
 * In dieser Klasse werden einige Strukturen der Programmiersprache Java demonstriert.
 */
public class StrukturenBeispiele {

    public static void main(String... args) {
        forBeispiel();
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
     * In dieser Methode sollen 6 und 3 entweder addiert, subtrahiert, multipliziert oder dividiert. Der Nutzer kann die Rechenart auswählen, indem er '+', '-', '*' oder '/' eingibt.
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
