import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {
        int km;
        double kmUcreti = 2.20, acilisUcreti = 10.0, toplamTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("KM'yi giriniz: ");
        km = input.nextInt();

        toplamTutar = km * kmUcreti + acilisUcreti;
        toplamTutar = (toplamTutar < 20) ? 20.0 : toplamTutar;
        System.out.println("Toplam Tutar: " + toplamTutar);
    }
}
