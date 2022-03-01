import java.util.HashMap;

public class Fibonacci {

    private static final HashMap<Integer, Integer> numberToResultMap = new HashMap<>();

    public static int findFibonacciNumber(int index) {

        if (index < 0) return -1;
        if (index <= 2) return 1;
        if (numberToResultMap.containsKey(index)) {
            return numberToResultMap.get(index);
        } else {
            int sum = findFibonacciNumber(index - 1) + findFibonacciNumber(index - 2);
            numberToResultMap.put(index, sum);
            return sum;
        }
    }

    public static boolean isFibonacciNumber(int number) {

        if (number < 0) return false;
        int nSquared = (int) Math.pow(number, 2);
        int formulaOne = (5 * nSquared) + 4;
        int formulaTwo = (5 * nSquared) - 4;
        return isPerfectSquare(formulaOne) || isPerfectSquare(formulaTwo);
    }

    private static boolean isPerfectSquare(int number) {
        int num = (int) Math.sqrt(number);
        return num * num == number;
    }
}
