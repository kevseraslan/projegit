public class TestGeometrıkSekıl1 {
    public static void main(String[] args){
        GeometrıkSekıl1 geonesne1= new Cember1(5);
        GeometrıkSekıl1 geonesne2=new Dıkdortgen1(5,3);
        System.out.println("iki nesne birbirine eşit alana  mi  sahip?" );

gösterGeometrikSekıl(geonesne1);
gösterGeometrikSekıl(geonesne2);


    }
    public static boolean eşitalan(GeometrıkSekıl1 nesne1,GeometrıkSekıl1 nesne2){
        return nesne1.getAlan()==nesne2.getAlan();

    }
    public static void gösterGeometrikSekıl(GeometrıkSekıl1 nesne){
        System.out.println();
        System.out.println("alan: "+nesne.getAlan());
        System.out.println("çevre :" +nesne.getÇevre());
    }
    }

