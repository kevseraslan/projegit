import java.io.*;
        import java.util.*;
public class MetınDeğışme {
public static void main(String[] args) throws Exception{
    if (args.length!=4) {
        System.out.println("kullanım java metin değişme kaynakdosya hedefdosya eskimetin yenimetin");
        System.exit(1);
    }
    File kaynakdosya=new File(args[0]);
    if (!kaynakdosya.exists()) {
        System.out.println("kaynak dosya"+args[0]+"mevcut değil");
        System.exit(2);

    }
    File hedefdosya =new  File(args[1]);
    if (hedefdosya.exists()) {
        System.out.println("hedefdosya" +args[1]+"zaten mevcut");
        System.exit(3);
    }
    try (


        Scanner giriş=new Scanner(kaynakdosya);
        PrintWriter çıkış=new PrintWriter(hedefdosya);
    ){
        while (giriş.hasNext()) {
            String s1=giriş.nextLine();
            String s2=s1.replaceAll(args[2],args[3]);
            çıkış.println(s2);
        }
    }
}
}
