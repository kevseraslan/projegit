public class Ogrenci {
    String isim;
    int yaş;
    boolean yeteneklimi;
    char cinsiyet;
}
class TestOgrenci {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        System.out.println("ismi: " + ogrenci.isim);
        System.out.println("yaş:" + ogrenci.yaş);
        System.out.println("yetenekli mi" + ogrenci.yeteneklimi);
        System.out.println("cinisyet " + ogrenci.cinsiyet);
    }
}