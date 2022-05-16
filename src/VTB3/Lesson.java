package VTB3;

public class Lesson {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] err1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15ex", "16"}
        };
        String[][] err2 = {
                {"1", "2", "3", "4", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            System.out.println(processingData(arr));
            System.out.println(processingData(err1));
        //    System.out.println(processingData(err2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("My exception caught!");
        }
    }

    public static int processingData(String[][] arr) throws MyExceptions {
        int sum = 0;

        if (arr.length != 4) throw new MyArraySizeException();
        else for (String[] check: arr)
            if (check.length != 4) throw new MyArraySizeException();
        for (int i = 0; i < arr.length; i++)
        for (int j = 0; j < arr[i].length; j++)
            try {
                sum += Integer.valueOf(arr[i][j]);
            } catch (NumberFormatException e) {
                throw new MyArrayDataException(i, j, arr);
            }
        return sum;
    }
}
