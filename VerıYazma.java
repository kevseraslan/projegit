import java.util.Scanner;
public class VerıYazma {
    public static void main(String[] args) throws Exception {
java.io.File dosya= new java.io.File("puan_listesi.txt");
Scanner giriş=new Scanner(dosya);

while (giriş.hasNext()) {
    String isim=giriş.next();
    String soyisim=giriş.next();
    String dersadı=giriş.next();
    int  notdeğeri=giriş.nextInt();
    System.out.println(isim+" " + soyisim+" " +dersadı+" "+notdeğeri);

}
        giriş.close();
    }
}
