import java.util.Scanner;
public class BolmeIstısnaIle {
    public static int Bolme(int sayı1,int sayı2){
        if (sayı2==0)
            throw  new ArithmeticException("bölen sıfır olamaz.");
        return sayı1/sayı2;
    }
    public static void main(String[] args){
        Scanner giriş=new Scanner(System.in);

        System.out.println("iki tam sayı giriniz:");
        int sayı1=giriş.nextInt();
        int sayı2=giriş.nextInt();
        try {
            int sonuç=Bolme(sayı1,sayı2);
            System.out.println(sayı1+"/"+sayı2+"="+sonuç);
        }
        catch (ArithmeticException ex){
            System.out.println("istisna: bir tam sayı 0 a bölünemez." );
        }
        System.out.println("yürütme devam ediyor");
    }

}
