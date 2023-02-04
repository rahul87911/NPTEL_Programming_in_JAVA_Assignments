import java.util.Scanner;

public class Exercise1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sum = -2;
        int i = 1;
        int temp = 0;

        while (i <= n) {
            sum = sum + 2;

            if (sum % 3 == 0) {
                temp = sum + temp;
            }
            i++;

        }
        sum = temp;

        System.out.print(sum);
    }
}
