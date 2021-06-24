import java.util.Scanner;

public class KdvTutariHesaplama {

    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        if (tutar > 0 && tutar <= 1000) {
            kdvOran = 0.18;
            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV Oranı: " + kdvOran);
            System.out.println("KDV Tutarı: " + kdvTutar);
            System.out.println("KDV'li Tutar: " + kdvliTutar);
        } else if (tutar > 1000) {
            kdvOran = 0.08;
            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV Oranı: " + kdvOran);
            System.out.println("KDV Tutarı: " + kdvTutar);
            System.out.println("KDV'li Tutar: " + kdvliTutar);
        }
    }
}
