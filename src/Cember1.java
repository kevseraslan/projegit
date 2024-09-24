public class Cember1 extends GeometrıkSekıl1{
    private double yarıçap;

    public Cember1(){
    }
    public Cember1(double yarıçap){
        this.yarıçap=yarıçap;
    }
    public Cember1(double yarıçap,String renk,boolean dolgu){
        this.yarıçap=yarıçap;
        setRenk("beyaz");
        setDolgu(dolgu);
    }
    public double getYarıçap(){
        return yarıçap;
    }
    public void setYarıçap(double yarıçap){
        this.yarıçap=yarıçap;
    }
    public double getÇap(){
        return yarıçap+yarıçap;
    }
    public double getÇevre(){
        return 2*Math.PI*yarıçap;
    }
    public void yazdırÇember1(){
        System.out.println("çemberin oluşturulma tarihi" +getOluşturulmaTarihi()+"ve yarıçapı "+ yarıçap+ "dır. ");
    }
    public String toString(){
        return super.toString() +"yarıçapı \n" +yarıçap;
    }
    public double getAlan(){
        return Math.PI*yarıçap*yarıçap;
    }
}
