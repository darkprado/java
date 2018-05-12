import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        String[][] array = new String[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.toString(rand.nextInt(50));
            }
        }

//        array[2][2] = "abc";

        for (String[] str : array) {
            System.out.println(Arrays.toString(str));
        }

        try {
            System.out.println("Сумма всех элементов массива = " + Massive.sumArray(array));
        } catch (MySizeArrayException s) {
            s.errorSize();
        } catch (MyArrayDataException s) {
            s.wereError();
        }

    }
}
