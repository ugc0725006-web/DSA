import java.util.Scanner;

public class RabbitProblem {

    // Iterative O(n) time, O(1) space
    public static long countRabbits(int months) {
        if (months <= 0) {
            return 0;
        }
        if (months == 1) {
            return 1;
        }
        long prev2 = 0; // Month 0
        long prev1 = 1; // Month 1
        for (int i = 2; i <= months; i++) {
            long current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int months = scanner.nextInt();
            System.out.println(countRabbits(months));
        }
        scanner.close();
    }
}