public class Ogrencı1 {

    int ogrencino;
    String isim;
    float burs;
    Ogrencı1(int ogrencino,String isim,float burs){
        this.ogrencino=ogrencino;
        this.isim=isim;
        this.burs=burs;

    }
    void bilgileriGöster(){
        System.out.println(ogrencino +" " +isim + "" + burs);
    }
}
