import java.util.Scanner;

public class DeseneGoreMetot {

    static void metot(int sayi, int a, boolean status) {
        if (sayi <= a) {
            System.out.print(sayi + " ");
            if (sayi > 0 && !status) {
                metot(sayi-5,a,false);
            }else{
                metot(sayi+5,a,true);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = s.nextInt();
        int a = sayi;
        metot(sayi,a,false);
    }
}

