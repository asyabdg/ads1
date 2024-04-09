import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10");
        int p = scanner.nextInt();
        int n;
        int a;
        double startTime, endTime, duration;
        int[] arr;
        switch(p) {
            case 1:
                System.out.println("Enter the length of the array:");
                n = scanner.nextInt();
                System.out.println("Enter the array:");
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }
                startTime = System.nanoTime();
                int result1 = find_min(arr, n);
                endTime = System.nanoTime();
                duration = (endTime - startTime) / 1000000;
                System.out.println("The minimum number of the array is " + result1);
                System.out.println("Time taken: " + duration + " milliseconds");
            case 2:
                System.out.println("Enter the length of the array:");
                n = scanner.nextInt();
                System.out.println("Enter the array:");
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }
                startTime = System.nanoTime();
                double result2 = average(arr, n);
                endTime = System.nanoTime();
                duration = (endTime - startTime) / 1000000;
                System.out.println("The average of the array is " + result2);
                System.out.println("Time taken: " + duration + " milliseconds");
            case 3:
                System.out.println("Enter a number:");
                n = scanner.nextInt();
                startTime = System.nanoTime();
                boolean result3 = isPrime(n);
                endTime = System.nanoTime();
                duration = (endTime - startTime) / 1000000;
                if (result3) {
                    System.out.println("The number is prime");
                } else {
                    System.out.println("The number is composit");
                }
                System.out.println("Time taken: " + duration + " milliseconds");
            case 4:
                System.out.println("Enter a number:");
                n = scanner.nextInt();
                startTime = System.nanoTime();
                int result4 = factorial(n);
                endTime = System.nanoTime();
                duration = (endTime - startTime) / 1000000;
                System.out.println("The factorial of the number is " + result4);
                System.out.println("Time taken: " + duration + " milliseconds");
            case 5:
                System.out.println("Enter the member number of the Fibonacci sequence");
                n = scanner.nextInt();
                startTime = System.nanoTime();
                int result5 = fibonacci(n);
                endTime = System.nanoTime();
                duration = (endTime - startTime) / 1000000;
                System.out.println("A member of the sequence with the entered number " + result5);
                System.out.println("Time taken: " + duration + " milliseconds");
            case 6:
                System.out.println("Enter number to be raised to a power:");
                a = scanner.nextInt();
                System.out.println("Enter index of exponent:");
                n = scanner.nextInt();
                startTime = System.nanoTime();
                int result6 = power(a, n);
                endTime = System.nanoTime();
                duration = (endTime - startTime) / 1000000;
                System.out.println("The first number entered to the power of the second number entered " + result6);
                System.out.println("Time taken: " + duration + " milliseconds");
            case 7:
                System.out.println("Enter the length of the array:");
                n = scanner.nextInt();
                System.out.println("Enter the array:");
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }
                System.out.println("The array in reverse order:");
                startTime = System.nanoTime();
                reverse_array(arr, n);
                endTime = System.nanoTime();
                duration = (endTime - startTime) / 1000000;
                System.out.println("Time taken: " + duration + " milliseconds");
            case 8:
                System.out.println("Enter string which to be check:");
                String s = scanner.next();
                startTime = System.nanoTime();
                boolean result8 = check_digits(s);
                endTime = System.nanoTime();
                if (result8) {
                    System.out.println("The string contains only digits");
                } else {
                    System.out.println("The string contains not only digits");
                }
        }
    }


    /** * This method finds the minimum number of the array
     * It uses an iterative approach
     * Time complexity: O(n), where n is the length of the array
     * resulting in linear time complexity
     * @param arr The array for which the minimum is to be found
     * @param n The length of the array arr
     * @return The minimun of the array */
    public static int find_min(int[] arr, int n) {
        if (arr.length == 0) {
            return 0;
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    /** * This method calculates the average of the array
     * It uses an iterative approach
     * Time complexity: O(n), where n is the length of the array
     * resulting in linear time complexity
     * @param arr The array for which the average is to be calculated
     * @param n The length of the array arr
     * @return The average of the array arr */
    public static double average(int[] arr, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum / n;
    }

    /** * This method determines whether the number is prime or composite
     * It uses an iterative approach
     * Time complexity: O(n), where n is the entered number
     * resulting in linear time complexity
     * @param n number that to be checked prime or composite
     * @return true if the number is prime, false if the number is composite */
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    /** * This method determines whether the number is prime or composite
     * It uses a recursive approach
     * Time complexity: O(n), where n is the entered number
     * resulting in linear time complexity
     * @param n number for which factorial is to be calcukated
     * @return factorial of the number n */
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }


    /** This method calculates the member of the Fibonacci sequence with the entered number
     * It uses a recursive approach
     * Time complexity: O(n^2), where n is the entered number
     * resulting in quadratic time complexity
     * @param n number of the element of the Fibonacci sequence that to be calculated
     * @return member of the Fibonacci sequence with the entered number */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }


    /** This method calculates the first number entered to the power of the second number entered
     * It uses a recursive approach
     * Time complexity: O(n), where n is the entered number
     * resulting in linear time complexity
     * @param a the number to be raised to a power
     * @param n index of exponent
     * @return a ^ n */
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }


    /**  This method output the entered array in reverse order
     * It uses a recursive approach
     * Time complexity: O(n), where n is the length of the array
     * resulting in linear time complexity
     * @param arr The array that to be reversed
     * @param n The length of the array arr
     * @return array arr in reverse order */
    public static void reverse_array(int[] arr, int n) {
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }
        System.out.print(arr[n - 1] + " ");
        reverse_array(arr, n - 1);
    }


    /** This method checks whether the entered string consists only of digits
     * It uses a recursive approach
     * Time complexity: O(n), where n is the length of the array
     * resulting in linear time complexity
     * @param s the string which to be checked on consisting only of digits
     * @return true if the string consists only of digits, false if the string consists not only of digits  */
    public static boolean check_digits(String s) {
        if (s.length() == 0) {
            return true;
        }
        if (!Character.isDigit(s.charAt(0))) {
            return false;
        }
        return check_digits(s.substring(1));
    }
}