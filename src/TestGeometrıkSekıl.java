public class TestGeometrıkSekıl {
    public static void main(String[] args) {


        GeometrkSekıl geonesne1 = new Cember(5);
        GeometrkSekıl geonesne2 = new Dıkdortgen(5, 3);
        System.out.println("eşit alana sahip mi ?" +esitAlan(geonesne1,geonesne2));
        gosterGeometrıkSekıl(geonesne1);
        gosterGeometrıkSekıl(geonesne2);

    }
    public static boolean esitAlan(GeometrkSekıl nesne1,GeometrkSekıl nesne2){
        return nesne1.getAlan()== nesne2.getAlan();
    }
    public static void gosterGeometrıkSekıl(GeometrkSekıl nesne){
        System.out.println();
        System.out.println("alan:" +nesne.getAlan());
        System.out.println("çevre:" +nesne.getÇevre());
    }
}