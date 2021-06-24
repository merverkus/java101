import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {
        int n1, n2, ebob = 1, i;

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        n2 = input.nextInt();

        if (n1 <= n2) {
            i = 1;
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.print("EBOB(" + n1 + "," + n2 + "): " + ebob);
        } else {
            i = 1;
            while (i <= n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.print("EBOB(" + n1 + "," + n2 + "): " + ebob);
        }
        i = 1;
        while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.print("\nEKOK(" + n1 + "," + n2 + "): " + i);
                break;
            }
            i++;
        }
    }
}
