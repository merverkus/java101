public class PalindromSayilar {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, mod;
        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print(isPalindrom(50505));
    }
}
