package BoksOyunu;

public class Main {

    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 15, 100, 90, 0);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 0);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
        int baslangic = (int) (Math.random() * 2);
        if (baslangic == 0) {
            System.out.println("Marc Başlıyor");
            Ring r1 = new Ring(alex, marc, 90, 100);
            r1.run();
        }
        if (baslangic == 1) {
            System.out.println("Alex Başlıyor");
            Ring r2 = new Ring(marc, alex, 90, 100);
            r2.run();
        }
    }
}
