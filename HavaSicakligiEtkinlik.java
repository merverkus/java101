import java.util.Scanner;

public class HavaSicakligiEtkinlik {

    public static void main(String[] args) {
        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.print("Sicaklik giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.print("Kayak yapabilirsiniz.");
        } else if (sicaklik >= 5 && sicaklik < 10) {
            System.out.print("Sinemaya gidebilirsiniz.");
        } else if (sicaklik >= 10 && sicaklik < 15) {
            System.out.print("Sinemaya gidebilirsiniz.\nPiknige gidebilirsiniz.");
        } else if (sicaklik >= 15 && sicaklik < 25) {
            System.out.print("Piknige gidebilirsiniz.");
        } else {
            System.out.print("Yuzmeye gidebilirsiniz.");
        }
    }
}
