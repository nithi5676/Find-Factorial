package findFactorial;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(find(number));
    }

    public static int find(int number) {
        if (number == 1) {
            return 1;
        }
        return find(number - 1) * number;
    }

}
