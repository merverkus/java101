import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args) {
        int armut, elma, domates, muz, patlican;
        double armutTL = 2.14, elmaTL = 3.67, domatesTL = 1.11, muzTL = 0.95, patlicanTL = 5.0, tutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kac kilo? ");
        armut = input.nextInt();
        System.out.print("Elma kac kilo? ");
        elma = input.nextInt();
        System.out.print("Domates kac kilo? ");
        domates = input.nextInt();
        System.out.print("Muz kac kilo? ");
        muz = input.nextInt();
        System.out.print("Patlican kac kilo? ");
        patlican = input.nextInt();

        tutar = ((armut * armutTL) + (elma * elmaTL) + (domates * domatesTL) + (muz * muzTL) + (patlican * patlicanTL));
        System.out.print("Toplam Tutar: " + tutar + " TL");
    }
}
