import java.util.Scanner;

public class UcakBileti {

    public static void main(String[] args) {
        int km, yas, yolculukTipi;
        double ucret = 0.10, indirimOrani = 0.0, gidisDonus = 0.0, tutar, yasIndirimi, indirimliTutar, biletIndirimi,
                toplamTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek yön , 2 => Gidiş Dönüş): ");
        yolculukTipi = input.nextInt();

        if (km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            switch (yolculukTipi) {
                case 1:
                    if (yas < 12) {
                        indirimOrani = 0.50;
                    } else if (yas >= 12 && yas < 24) {
                        indirimOrani = 0.10;
                    } else if (yas > 65) {
                        indirimOrani = 0.30;
                    }
                    break;
                case 2:
                    gidisDonus = 0.20;
                    if (yas < 12) {
                        indirimOrani = 0.50;
                    } else if (yas >= 12 && yas < 24) {
                        indirimOrani = 0.10;
                    } else if (yas > 65) {
                        indirimOrani = 0.30;
                    }
                    break;
            }
            tutar = km * ucret;
            yasIndirimi = tutar * indirimOrani;
            indirimliTutar = tutar - yasIndirimi;
            biletIndirimi = indirimliTutar * gidisDonus;
            toplamTutar = (indirimliTutar - biletIndirimi) * yolculukTipi;
            System.out.print("Toplam Tutar: " + toplamTutar + " TL");
        } else {
            System.out.print("Hatalı veri girdiniz!");
        }
    }
}
