import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }

            for (int k = (2 * i - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
