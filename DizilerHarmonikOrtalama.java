public class DizilerHarmonikOrtalama {

    public static void main(String[] args) {
        int[] list = { 2, 9, 7, 3, 6 };
        double toplam = 0.0;
        for (int i = 0; i < list.length; i++) {
            toplam += (1.0 / list[i]);
        }
        System.out.print(list.length / toplam);
    }
}
