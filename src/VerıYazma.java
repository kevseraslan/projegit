import java.io.*;

public class VerıYazma {
    public static void main(String[] args) throws IOException {
        File dosya = new File("puan_listesi.txt");
        if (dosya.exists()) {
            System.out.println("dosya mevcut ");
            System.exit(0);
        }
        try (

                PrintWriter çıkış = new PrintWriter(dosya);
        ) {
            çıkış.print("kevser aslan algoritma");
            çıkış.println("70");
            çıkış.print("diğer kişi algoritma");
            çıkış.println("90");

        }
    }
}
