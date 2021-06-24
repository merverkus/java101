import java.util.Arrays;

public class DizidekiEnYakinSayilar {

    public static void main(String[] args) {
        int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };
        int sayi = 5;
        System.out.print("Dizi: " + Arrays.toString(list));
        System.out.print("\nGirilen sayı: " + sayi);
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            if (list[i] > sayi) {
                System.out.print("\nGirilen sayıdan küçük en yakın sayı: " + list[i - 1]);
                System.out.print("\nGirilen sayıdan büyük en yakın sayı: " + list[i]);
                break;
            }
        }
    }
}
