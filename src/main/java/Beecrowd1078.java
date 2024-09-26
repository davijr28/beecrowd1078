
import java.util.Scanner;

public class Beecrowd1078 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", i, N, i * N);
        }
    }
}
