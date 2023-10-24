import java.util.ArrayList;
import java.util.List;

public class Primos {
    public static List<Integer> primeLinear(int number) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> primeRecursive(int number) {
        List<Integer> primeNumbers = new ArrayList<>();
        primeRecursiveHelper(number, 2 , primeNumbers);
        return primeNumbers;
    }

    private static void primeRecursiveHelper(int number, int currentNumber, List<Integer> primeNumbers) {
        if (currentNumber > number) {
            return;
        }

        if (isPrimeRecursive(currentNumber)) {
            primeNumbers.add(currentNumber);
        }

        primeRecursiveHelper(number, currentNumber + 1, primeNumbers);
    }

        private static boolean isPrimeRecursive(int number) {
            return number > 1 && isPrimeHelper(number, number -1);
        }

        private static boolean isPrimeHelper(int number, int divisor) {
            return divisor == 1 || (number % divisor != 0 && isPrimeHelper(number, divisor -1));
        }
    public static void main(String[] args) {
        int number = 15;


        System.out.println("Usando abordagem Linear, os números primos entre 1 e " + number + " é " + primeLinear(number));
        System.out.println("Usando abordagem Recursiva, os números primos entre 1 e " + number + " é " + primeRecursive(number));
    }

    
}
