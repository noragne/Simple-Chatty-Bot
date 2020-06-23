import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            sum += n;
            if (n == 0) {
                break;
            }
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        }
        System.out.println(sum);
    }
}
