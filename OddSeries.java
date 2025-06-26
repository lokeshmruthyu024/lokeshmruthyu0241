import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddSeries {
    public static List<Integer> generateOddSeries(int a) {
        List<Integer> result = new ArrayList<>();
        if (a < 1) {
            return result;
        }
        for (int i = 0; i < a; i++) {
            result.add(2 * i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (a): ");
        int a = scanner.nextInt();

        List<Integer> result = generateOddSeries(a);
        System.out.println("Output: " + result);

        scanner.close();
    }
}
