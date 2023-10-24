public class Fibonacci {
    public static int fibLinear(int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }

        int prevNumber = 0;
        int currentNumber = 1;

        for (int i = 2; i <= number; i++) {
            int nextNumber = prevNumber + currentNumber;
            prevNumber = currentNumber;
            currentNumber = nextNumber;
        }

        return currentNumber;
    }

    public static int fibRecursive(int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }

        else {
            return fibRecursive(number - 1) + fibRecursive(number - 2);
        }
    } 

    public static void main(String[] args) {
        int number = 3;
        System.out.println("Fibonacci linear de " + number + ": " + fibLinear(number));
        System.out.println("Fibonacci recursivo de " + number + ": " + fibRecursive(number));
    }
}

