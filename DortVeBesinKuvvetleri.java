import java.util.Scanner;

public class DortVeBesinKuvvetleri {

    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        System.out.print("4'ün kuvvetleri: ");
        for (int i = 1; i <= sayi; i *= 4) {

            System.out.print(i + ",");
        }
        System.out.println("");
        System.out.print("5'in kuvvetleri: ");
        for (int j = 1; j <= sayi; j *= 5) {

            System.out.print(j + ",");
        }
    }
}
