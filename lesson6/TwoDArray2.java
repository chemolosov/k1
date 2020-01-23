
package lesson6;
public class TwoDArray2 {
    public static void main(String[] args) {
        char[][] array = {
                {'a', 'n'},
                {'a', 'h'},
                {'b', 'g'},
                {'v', 'd'}};
        for (char[] row : array) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

