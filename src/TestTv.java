public class TestTv {
    public static void main(String[] args) {


        Tv tv1 = new Tv();
        tv1.aç();
        tv1.setKanal(30);
        tv1.setSesSeviyesi(3);
        Tv tv2 = new Tv();
        tv2.aç();
        tv2.kanalYukarı();
        tv2.kanalAşağı();
        tv2.sesArttır();

        System.out.println("tv1 in kanalı:" +tv1.kanal+"tv1 nin ses seviyesi "+tv1.sesSeviyesi);
        System.out.println("tv2 in kanalı :" +tv2.kanal+"TV2 NİN ses seviyesi: " +tv2.sesSeviyesi);
    }

}