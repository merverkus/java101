import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        int sayi1, sayi2;
        String islem = null;

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        sayi2 = input.nextInt();
        System.out.print("Yapmak istediğiniz işlemi giriniz: ");
        islem = input.next();

        switch (islem) {
            case "+":
                System.out.print("Toplama: " + (sayi1 + sayi2));
                break;
            case "-":
                System.out.print("Çıkarma: " + (sayi1 - sayi2));
                break;
            case "*":
                System.out.print("Çarpma: " + (sayi1 * sayi2));
                break;
            case "/":
                if (sayi2 != 0) {
                    System.out.print("Bölme: " + (sayi1 / sayi2));
                    break;
                } else {
                    System.out.print("Bir sayı 0'a bölünemez!");
                    break;
                }
            default:
                System.out.print("Yanlıl seçim yaptınız. Tekrar deneyiniz.");
        }
    }
}
