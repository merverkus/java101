import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        String userName, password, newPassword, yanit;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.print("Giriş başarılı!");
        } else {
            System.out.print("Bilgileriniz yanlış! \nŞifrenizi sıfırlamak isterseniz evet, istemezseniz hayır yazın: ");
            yanit = input.nextLine();
            if (yanit.equals("evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();
                if (newPassword.equals(password) || newPassword.equals("java101")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.print("Şifre oluşturuldu.");
                }
            } else if (yanit.equals("hayır")) {
                System.out.print("İsteginiz üzerine şifreniz sıfırlanmadı.");
            } else {
                System.out.print("Geçersiz yanıt!");
            }
        }
    }
}
