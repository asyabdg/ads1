import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10");
        int p = scanner.nextInt();
        int n;
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
        }
    }

    /** * This method finds the minimum number of the array
     * It uses an iterative approach *
     * Time complexity: O(n), where n is the length of the array
     * resulting in linear time complexity
     * @param arr The array for which the minimum is to be found
     * @param n The length of the array arr
     * @return The minimun of the array */
    public static int find_main(int[] arr, int n) {
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


}