public class FactorialGenerator {
    public static void main(String[] args) {
        for (int i = 50; i <= 60; i++) {
            System.out.println("Factorial of " + i + " is " + calculateFactorial(i));
        }
    }

    public static long calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}