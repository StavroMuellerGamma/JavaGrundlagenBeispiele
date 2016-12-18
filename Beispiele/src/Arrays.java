import java.util.Random;

/**
 * In dieser Klasse werden einige Funktionen von Arrays in der Programmiersprache Java demonstriert.
 */
public class Arrays {
    public static void main(String... args) {
        int[] array = generateArray();
        manipulateArray(array);
    }

    /**
     * In dieser Methode wird ein zufälliges Integer-Array der Länge 10 generiert und zurückgegeben.
     * @return Das generierte Array
     */
    private static int[] generateArray() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    /**
     * In dieser Methde werden einige Möglichkeiten Arrays zu manipulieren demonstriert.
     * @param pArray Das Array, das manipuliert werden soll
     */
    private static void manipulateArray(int[] pArray) {
        // einem Element des Arrays einen Wert zuweisen
        pArray[0] = 42;
        // zwei Elemente tauschen
        int tmp = pArray[0];
        pArray[0] = pArray[1];
        pArray[1] = tmp;
    }
}
