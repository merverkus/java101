import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        int n = input.nextInt();
        System.out.println("Dizinin elemanlarını giriniz: ");
        int[] list = new int[n];
        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
