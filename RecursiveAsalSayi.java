import java.util.Scanner;

public class RecursiveAsalSayi {

    static boolean asal(int n, int i) {
        if (n < 2)
            return false;
        if (i == 1)
            return true;
        if (n % i == 0)
            return false;
        return asal(n, i - 1);
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        n = input.nextInt();
        if (asal(n, n / 2)) {
            System.out.print(n + " sayisi ASALDIR!");
        }
        else{
            System.out.print(n + " sayisi ASAL degildir!");
        }
    }
}
