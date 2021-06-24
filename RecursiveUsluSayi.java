import java.util.Scanner;

public class RecursiveUsluSayi {

    static int us(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * us(a, b - 1);
        }
    }

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban degerini giriniz: ");
        a = input.nextInt();
        System.out.print("Us degerini giriniz: ");
        b = input.nextInt();
        System.out.print("Sonuc: " + us(a, b));
    }
}
