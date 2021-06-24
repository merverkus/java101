import java.util.Scanner;

public class Kombinasyon {

    public static void main(String[] args) {
        int n, r, cikarma, nFaktoriyel = 1, rFaktoriyel = 1, nrFaktoriyel = 1,kombinasyon;
        Scanner input = new Scanner(System.in);
        System.out.print("n sayisini giriniz: ");
        n = input.nextInt();
        System.out.print("r sayisini giriniz: ");
        r = input.nextInt();

        if (n >= r && n > 0 && r > 0) {
            cikarma = n - r;
            for (int i = 1; i <= n; i++) {
                nFaktoriyel *= i;
            }
            for (int i = 1; i <= r; i++) {
                rFaktoriyel *= i;
            }
            for (int i = 1; i <= cikarma; i++) {
                nrFaktoriyel *= i;
            }
            kombinasyon = nFaktoriyel / (rFaktoriyel * nrFaktoriyel);
            System.out.print("C(n,r) = " + kombinasyon);
        } else {
            System.out.print("Lütfen geçerli bir sayı giriniz!");
        }
    }
}
