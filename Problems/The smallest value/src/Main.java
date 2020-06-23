import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long m = sc.nextLong();
        int n = 1;
        long pro = 1L;

        while (pro <= m) {
            n += 1;
            int nIn = n;
            while (nIn >= 1) {
                pro *= nIn;
                nIn--;
            }
            if (pro > m) {
                break;
            } else {
                pro = 1;
            }
        }
        System.out.println(n);
    }
}
