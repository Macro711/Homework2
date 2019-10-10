

public class Homework2 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"5", "5", "8", "4"}, {"4", "2", "7", "3"}, {"0", "6", "2", "5"}, {"9", "1", "3", "1"}};
        try{
            int result = TotalSum(arr);

        System.out.println("Сумма массива =" + result + " ");
        }
        catch (MyArraySizeException | MyArrayDataException e){
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
    }


    public static int TotalSum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (MyArrayDataException e) {
                        System.out.println("в ячейке  [" + i + "],[" + j + "] не int");
                    }
                }
            }
            return sum;
    }
}
