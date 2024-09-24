import java.util.Scanner;
public class BolmeIstısnaIle1 {
    public static int bolme(int sayı1, int sayı2) {
        if (sayı2 == 0)
            throw new ArithmeticException("bölen sıfır olamaz");
        return sayı1 / sayı2;
    }


    public static void main(String[] args) {
        Scanner giriş = new Scanner(System.in);

        System.out.println("iki tam sayı giriniz.");
        int sayı1 = giriş.nextInt();
        int sayı2 = giriş.nextInt();

        try {
            int sonuç = bolme(sayı1, sayı2);
            System.out.println(sayı1 + " /" + sayı2 + " =" + sonuç + "dır .");
        } catch (ArithmeticException ex) {
            System.out.println("istisna : bir tam sayı " + "sıfıra bölünemez.");
        }
        System.out.println("yürütmeye devam ediyor. ");
    }
}