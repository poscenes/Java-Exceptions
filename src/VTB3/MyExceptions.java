package VTB3;

public class MyExceptions extends RuntimeException {
    public MyExceptions() {
    }

    public MyExceptions(String data) {
        super(data);
    }
}

class MyArraySizeException extends MyExceptions {
    public MyArraySizeException() {
        super("Size limit is 4x4");
    }
}

class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int row, int col, String[][] data) {
        super("Irrelevant data in [" + row + "," + col + "]: " + data[row][col]);
    }
}