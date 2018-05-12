public class MyArrayDataException extends Exception {

    private int row, col;

    MyArrayDataException(int i, int j) {
        row = ++i;
        col = ++j;
    }

    void wereError () {
        System.out.println("Ошибка данных в строке " + row + " столбце " + col);
    }

}
