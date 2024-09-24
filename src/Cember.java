public class Cember extends GeometrkSekıl{
    private double yarıçap;

    public Cember(){

    }
    public Cember(double yarıçap){
        this.yarıçap=yarıçap;
    }
    public Cember(double yarıçap,String renk,boolean dolgu){
        this.yarıçap=yarıçap;
        setRenk(renk);
        setDolgu(dolgu);
    }
    public double getYarıçap(){
        return yarıçap;
    }
    public void setYarıçap(double yarıçap){
        this.yarıçap=yarıçap;
    }
    public double getÇap(){
        return 2*yarıçap;
    }
    public  double getAlan(){
        return Math.PI*yarıçap*yarıçap;
    }
    public double getÇevre(){
        return 2*Math.PI*yarıçap;
    }
    public void yazdırcember(){
        System.out.println("çember"+getOluşturulmatarihi()+"tarihinde oluşturukdu yarıçapı "+yarıçap);

    }
    public String toString(){
        return super.toString() +"\n yarıçap"+yarıçap;
    }

}
