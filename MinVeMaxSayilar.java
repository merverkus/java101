import java.util.Scanner;

public class MinVeMaxSayilar {

    public static void main(String[] args) {
        int n, sayi, max = 0, min = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = input.nextInt();
            if (i == 1) {
                max = sayi;
                min = sayi;
            } else {
                if (sayi >= max) {
                    max = sayi;
                }
                if (sayi <= min) {
                    min = sayi;
                }
            }
        }
        System.out.print("En büyük sayı: " + max);
        System.out.print("\nEn küçük sayı: " + min);
    }
}
