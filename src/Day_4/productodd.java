package Day_4;

import java.util.Scanner;

public class productodd {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int product = 1;

        for (int i = 1; i <= n; ++i) {
            if (i % 2 != 0) {
                product *= i;
            }
        }

        System.out.println(product);
        scanner.close();
    }
}