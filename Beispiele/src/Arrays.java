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
     * Mithilfe einer {@link Schleifen#forBeispiel() for-Schleife} wird das Array vom kleinsten bis zum größten Index durchlaufen.
     * Für jeden Index wird mithilfe der Klasse {@link Random} ein pseudozufälliger Integer-Werst erzeugt und in die Zelle dieses Indexes geschrieben.
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
     * In dieser Methode werden einige Möglichkeiten Arrays zu manipulieren demonstriert.
     * Um einer Zelle eines Arrays einen Wert zuzuweisen oder aus einer Zelle eines Arrays auszulesen, muss nach dem Namen des Arrays in eckigen Klammern der Index der Zelle angegeben werden, in die geschrieben werden soll oder aus der gelesen werden soll.
     * Um zwei Elemente eines Arrays ihre Plätze tauschen zu lassen, braucht man eine temporäre Variable, in die der erste der Werte geschrieben wird.
     * Die Zelle mit diesem Wert muss danach mit dem zweiten Wert überschrieben werden, mit dem getauscht werden soll.
     * Zuletzt muss der Inhalt der temporären Variable in die ursprüngliche zweite Zelle geschrieben werden.
     * @param pArray Das Array, das manipuliert werden soll
     */
    private static void manipulateArray(int[] pArray) {
        // einem Element des Arrays einen Wert zuweisen
        pArray[0] = 42;
        // zwei Elemente tauschen
        int tmp = pArray[0];
        pArray[0] = pArray[1];
        pArray[1] = tmp;
        // ein Element aus dem Array lesen
        int i = pArray[2];
    }
}
