import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddSeriesCeiling {
    public static List<Integer> generateOddSeriesCeiling(int a) {
        List<Integer> result = new ArrayList<>();
        if (a < 1) {
            return result;
        }
        int count = (a + 1) / 2;
        for (int i = 0; i < count; i++) {
            result.add(2 * i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (a): ");
        int a = scanner.nextInt();

        List<Integer> result = generateOddSeriesCeiling(a);
        System.out.println("Output: " + result);

        scanner.close();
    }
}
