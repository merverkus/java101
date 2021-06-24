import java.util.Scanner;

public class UsluSayi {

    public static void main(String[] args) {
        int taban, us, sonuc = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban: ");
        taban = input.nextInt();
        System.out.print("Üs: ");
        us = input.nextInt();

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }
        System.out.print("Sonuç: " + sonuc);
    }
}
