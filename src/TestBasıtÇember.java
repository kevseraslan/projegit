public class TestBasıtÇember {
    public static void main(String[] args){
        BasıtÇember çember1=new BasıtÇember();
        System.out.println("yarıçapı"+çember1.yarıçap+"olan çemberin alanı"+çember1.getAlan());
        BasıtÇember çember2=new BasıtÇember(25);
        System.out.println("yarıçapı" +çember2.yarıçap+"olan çemberin alanı:" +çember2.getAlan());
        çember2.yarıçap=100;
        System.out.println("yarıçapı"+çember2.yarıçap+"olan çemberin alanı: "+çember2.getAlan());
    }
}
