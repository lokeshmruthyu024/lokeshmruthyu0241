import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountMultiples {
    public static Map<Integer, Integer> countMultiples(int[] numbers) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        Map<Integer, Integer> result = countMultiples(numbers);
        System.out.println("Output: " + result);
        scanner.close();
    }
}