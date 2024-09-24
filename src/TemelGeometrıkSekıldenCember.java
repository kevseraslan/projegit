public class TemelGeometrıkSekıldenCember extends TemelGeometrıkSekıl{

    private double yarıçap;
    public TemelGeometrıkSekıldenCember(){
    }
    public TemelGeometrıkSekıldenCember(double yarıçap){
        this.yarıçap=yarıçap;

    }
    public TemelGeometrıkSekıldenCember(double yarıçap,String renk,boolean dolgu){
        this.yarıçap=yarıçap;
        setRenk(renk);
        setDolgu(dolgu);
    }
    public double getYarıçap(){
        return yarıçap;
    }
    public double getÇevre() {
        return 2*Math.PI*yarıçap;
        }
        public double getCap() {
        return yarıçap+yarıçap;
    }
    public void yazdırÇember() {
        System.out.println("oluşturulma tarihi: " +getOluşturulmaTarihi()+"yarıçapı: "+getYarıçap());
    }

}
