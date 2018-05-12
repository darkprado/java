class Massive {
    private static final int SIZE = 4;

    static int sumArray(String[][] array) throws MySizeArrayException, MyArrayDataException {
        if(array.length != SIZE) {
            throw new MySizeArrayException();
        }
        for (String[] arr : array) {
            if (arr.length != SIZE) {
                throw new MySizeArrayException();
            }
        }
        int sum = 0, i = 0, j = 0;
        try {
            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array[i].length; j++) {
                    sum += Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(i, j);
        }
        return sum;
    }
}
