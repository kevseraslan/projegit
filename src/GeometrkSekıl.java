public abstract class GeometrkSekıl {
    private String renk="beyaz";
    private boolean dolgu;
    private java.util.Date oluşturulmatarihi;
    protected  GeometrkSekıl(){
        oluşturulmatarihi =new java.util.Date();

    }
    protected GeometrkSekıl(String renk, boolean dolgu){
        oluşturulmatarihi=new java.util.Date();
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
    public java.util.Date getOluşturulmatarihi(){
        return oluşturulmatarihi;
    }
    @Override
    public String toString(){
        return "oluşturulma tarihi"+oluşturulmatarihi+"renk"+renk+"dolgu"+dolgu;
    }
    public abstract double getAlan();


    public abstract double getÇevre();



}
