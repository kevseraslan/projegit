import java.util.Date;

public abstract class GeometrıkSekıl1 {
  private   String renk="beyaz";
    private  boolean dolgu;
    private  java.util.Date oluşturulmaTarihi;

    protected GeometrıkSekıl1() {
        oluşturulmaTarihi=new java.util.Date();
    }

   protected GeometrıkSekıl1(String renk,boolean dolgu){
        oluşturulmaTarihi=new java.util.Date();
this.renk=renk;
this.dolgu=dolgu;
    }
    public String getRenk(){
        return renk;
    }
    public void setRenk(String renk){
        this.renk=renk;
    }
    public boolean isDolgu(){
        return dolgu;
    }
    public void setDolgu(boolean dolgu){
        this.dolgu=dolgu;
    }
public java.util.Date getOluşturulmaTarihi(){
return oluşturulmaTarihi;
}
public String toString() {
        return "oluşturulma tarihi: " +oluşturulmaTarihi+"renk: " +renk+ " ve dolgu: " +dolgu;
}
public abstract double getAlan();


public abstract double getÇevre();


}
