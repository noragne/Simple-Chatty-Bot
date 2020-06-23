import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
        int i = 1;
        long po = n;
        if (m == 0) {
            return 1;
        }
        while (i < m) {
            po *= n;
            i++;
        }
        return po;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}