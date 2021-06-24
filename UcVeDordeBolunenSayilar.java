import java.util.Scanner;

public class UcVeDordeBolunenSayilar {

    public static void main(String[] args) {
        int sayi, toplam = 0, sayac = 0;
        double ort;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                sayac++;
                System.out.print(i + ",");
                toplam += i;
            }
        }
        ort = toplam / sayac;
        System.out.println("");
        System.out.println("Ortalama: " + ort);
    }
}
