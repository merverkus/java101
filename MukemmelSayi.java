import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {
        int n, toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }
        if (toplam == n) {
            System.out.print(n + " Mükemmel sayıdır.");
        } else {
            System.out.print(n + " Mükemmel sayı değildir.");
        }
    }
}
