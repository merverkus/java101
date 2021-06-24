import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {
        int yil, kalan1, kalan2, kalan3;
        String s = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        yil = input.nextInt();
        kalan1 = yil % 4;
        kalan2 = yil % 100;
        kalan3 = yil % 400;

        if (kalan2 == 0) {
            if (kalan3 == 0) {
                s = " bir artık yıldır!";
            } else {
                s = " bir artık yıl değildir!";
            }
        } else {
            if (kalan1 == 0) {
                s = " bir artık yıldır!";
            } else {
                s = " bir artık yıl değildir!";
            }
        }
        System.out.print(yil + s);
    }
}
