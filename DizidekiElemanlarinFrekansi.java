import java.util.Arrays;

public class DizidekiElemanlarinFrekansi {

    public static void main(String[] args) {
        int[] list = { 10, 20, 20, 10, 10, 20, 5, 20 };
        System.out.print("Dizi: " + Arrays.toString(list));
        Arrays.sort(list);
        int count;
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < list.length; i++) {
            count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                }
            }
            if (i == 0 && list[i + 1] == list[i]) {
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
            }
            if (i == 0 && list[i + 1] != list[i]) {
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
            }
            if (i != 0 && list[i - 1] != list[i]) {
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
            }
        }
    }
}
