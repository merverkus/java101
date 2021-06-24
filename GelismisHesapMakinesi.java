import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int toplama(int a, int b) {
        int sonuc = a + b;
        System.out.print("Toplama: " + sonuc);
        return sonuc;
    }

    static int cikarma(int a, int b) {
        int sonuc = a - b;
        System.out.print("Çıkarma: " + sonuc);
        return sonuc;
    }

    static int carpma(int a, int b) {
        int sonuc = a * b;
        System.out.print("Çarpma: " + sonuc);
        return sonuc;
    }

    static int bolme(int a, int b) {
        if (b == 0) {
            System.out.print("2. sayı 0'dan farklı olmalı!");
            return 0;
        } else {
            int sonuc = a / b;
            System.out.print("Bölme: " + sonuc);
            return sonuc;
        }
    }

    static int usluSayi(int a, int b) {
        int sonuc = 1;
        for (int i = 1; i <= b; i++) {
            sonuc *= a;
        }
        return sonuc;
    }

    static void factorial(int a, int b) {
        int sonuc1 = 1, sonuc2 = 1;
        for (int i = 1; i <= a; i++) {
            sonuc1 *= i;
        }
        for (int j = 1; j <= b; j++) {
            sonuc2 *= j;
        }
        System.out.print("1. sayının faktoriyeli: " + sonuc1);
        System.out.print("\n2. sayının faktoriyeli: " + sonuc2);
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void dikdortgen(int a, int b) {
        System.out.print("Çevresi: " + (2 * (a + b)));
        System.out.print("\nAlanı: " + (a * b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "\n1- Toplama İşlemi\n" + "2- Çıkarma İşlemi\n" + "3- Çarpma İşlemi\n" + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n" + "0- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("1. sayı: ");
            int a = input.nextInt();
            System.out.print("2. sayı: ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    toplama(a, b);
                    break;
                case 2:
                    cikarma(a, b);
                    break;
                case 3:
                    carpma(a, b);
                    break;
                case 4:
                    bolme(a, b);
                    break;
                case 5:
                    System.out.print("Üs hesabı: " + usluSayi(a, b));
                    break;
                case 6:
                    factorial(a, b);
                    break;
                case 7:
                    System.out.print("Mod işlemi: " + mod(a, b));
                    break;
                case 8:
                    dikdortgen(a, b);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz!");
            }
        }
        System.out.println("Cıkış Yaptınız.");
    }
}
