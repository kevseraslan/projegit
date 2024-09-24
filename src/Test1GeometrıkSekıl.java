public class Test1GeometrıkSekıl {
    public static void main(String[] args){
        TemelGeometrıkSekıldenCember çember1=new TemelGeometrıkSekıldenCember(1);
        System.out.println("bir çember :" +çember1.toString());
        System.out.println("renk: "+çember1.getRenk());
        System.out.println("dolgu: " +çember1.isDolgu());
        System.out.println("çap: " +çember1.getCap());
        System.out.println("çevre: " +çember1.getÇevre());


        TemelGeometrıkSekıldenDıkdortgen dıkdortgen1=new TemelGeometrıkSekıldenDıkdortgen();
        System.out.println("bir dikdörtgen : " +dıkdortgen1.toString());
        System.out.println("çevre: " +dıkdortgen1.getÇevre());
        System.out.println("alan: " + dıkdortgen1.getAlan());
    }
}
