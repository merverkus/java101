package MayinTarlasi;

import java.util.Scanner;

public class MineSweeper {

    Scanner input = new Scanner(System.in);

    public void run() {
        System.out.print("Satır sayısını giriniz: ");
        int satir = input.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        int sutun = input.nextInt();
        int mayin = (satir * sutun) / 4;
        String[][] matris = new String[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                matris[i][j] = "-";
            }
        }
        for (int i = 0; i < mayin; i++) {
            int randSatir = (int) (Math.random() * satir);
            int randSutun = (int) (Math.random() * sutun);
            switch (matris[randSatir][randSutun]) {
                case "*":
                    i -= 1;
                case "-":
                    matris[randSatir][randSutun] = "*";
            }
        }
        System.out.println("Mayınların Konumu");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("============================");
        play(matris, satir, sutun);
    }

    public void play(String[][] matris, int satir, int sutun) {
        System.out.println("Mayın Tarlası Oyununa Hoş Geldiniz! ");
        String[][] gizliMatris = new String[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                gizliMatris[i][j] = "-";
            }
        }
        boolean status = true;
        int count = 0;
        int r, c, info = 0;
        do {
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    System.out.print(gizliMatris[i][j] + " ");
                }
                System.out.println();
            }
            do {
                System.out.print("Satır giriniz: ");
                r = input.nextInt();
                System.out.print("Sütun giriniz: ");
                c = input.nextInt();
                if (r >= satir || c >= sutun) {
                    System.out.println("Satır veya sütun sayısından büyük sayı girmeyiniz. Lütfen tekrar deneyin. ");
                }
            } while (r >= satir || c >= sutun);

            if (matris[r][c].equals("*")) {
                System.out.println("Game Over!!");
                status = false;
            } else {
                info = 0;
                if (r - 1 >= 0) {
                    if (matris[r - 1][c].equals("*")) {
                        info++;
                    }
                }
                if (r - 1 >= 0 && c - 1 >= 0) {
                    if (matris[r - 1][c - 1].equals("*")) {
                        info++;
                    }
                }
                if (c - 1 >= 0) {
                    if (matris[r][c - 1].equals("*")) {
                        info++;
                    }
                }
                if (c + 1 < sutun) {
                    if (matris[r][c + 1].equals("*")) {
                        info++;
                    }
                }
                if (c + 1 < sutun && r + 1 < satir) {
                    if (matris[r + 1][c + 1].equals("*")) {
                        info++;
                    }
                }
                if (r + 1 < satir) {
                    if (matris[r + 1][c].equals("*")) {
                        info++;
                    }
                }
                if (r - 1 >= 0 && c + 1 < sutun) {
                    if (matris[r - 1][c + 1].equals("*")) {
                        info++;
                    }
                }
                if (r + 1 < satir && c - 1 >= 0) {
                    if (matris[r + 1][c - 1].equals("*")) {
                        info++;
                    }
                }
                gizliMatris[r][c] = String.valueOf(info);
                count++;
            }
            System.out.println("============================");
        } while (status && count < (satir * sutun) - ((satir * sutun) / 4));
        if (status) {
            System.out.println("Oyunu Kazandınız! ");
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    if (gizliMatris[i][j].equals("-")) {
                        System.out.print("* ");
                    } else {
                        System.out.print(gizliMatris[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}

