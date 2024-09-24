import java.util.Scanner;
public class Bolme{
    public static int bölme(int sayı1, int sayı2) {
        if (sayı2 == 0) {
            System.out.println("bölen 0 olamaz.");
            System.exit(1);
        }
        return sayı1 / sayı2;

    }

    public static void main(String[] args){
        Scanner giriş=new Scanner(System.in);
        System.out.println("iki tam sayı giriniz:");
        int sayı1=giriş.nextInt();
        int sayı2=giriş.nextInt();
        int sonuç=bölme (sayı1,sayı2);
        System.out.println(sayı1+"/"+sayı2+"="+sonuç);
    }
}
