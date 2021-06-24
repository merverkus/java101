import java.util.Scanner;

public class BasamakSayilarininToplami {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();

        int temp = n;
        int mod, toplam = 0;

        while (temp != 0) {
            mod = temp % 10;
            toplam += mod;
            temp /= 10;
        }
        System.out.print("Basamak sayıları toplamı: " + toplam);
    }
}
