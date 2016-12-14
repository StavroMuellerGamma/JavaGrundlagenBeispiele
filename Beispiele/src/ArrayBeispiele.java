import java.util.Random;

/**
 * In dieser Klasse werden einige Funktionen von Arrays in der Programmiersprache Java demonstriert.
 */
public class ArrayBeispiele {
    public static void main(String... args) {

    }

    /**
     * In dieser Methode wird ein zufälliges Integer-Array der Länge {@code length} generiert und zurückgegeben.
     * @param length Die Länge des zurückzugenden Arrays
     * @return Das generierte Array
     */
    private static int[] generateArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }


}
