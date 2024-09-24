public class Dıkdortgen1 extends GeometrıkSekıl1{

    private double genişlik;
    private double yükseklik;

    public Dıkdortgen1(){
    }
    public Dıkdortgen1(double genişlik,double yükseklik){
        this.genişlik=genişlik;
        this.yükseklik=yükseklik;
    }
    public Dıkdortgen1(double genişlik,double yükseklik,String renk,boolean dolgu){
        this.genişlik=genişlik;
        this.yükseklik=yükseklik;
        setRenk("beyaz");
        setDolgu(dolgu);

    }
    public double getGenişlik(){
        return genişlik;
    }
    public void setGenişlik(double genişlik){
        this.genişlik=genişlik;

    }
    public double getYükseklik(){
        return yükseklik;
    }
    public void setYükseklik(double yükseklik){
        this.yükseklik=yükseklik;
    }
    public double getAlan(){
        return genişlik*yükseklik;

    }
    public double getÇevre(){
        return 2*(genişlik+yükseklik);
    }

}
