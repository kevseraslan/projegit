public class Dıkdortgen  extends GeometrkSekıl{
    private double genişlik;
    private double yükseklik;
    public Dıkdortgen(){

    }
    public Dıkdortgen(double genişlik,double yükseklik){
        this.genişlik=genişlik;
        this.yükseklik=yükseklik;
    }
    public Dıkdortgen(double genişlik,double yükseklik,String renk,boolean dolgu){
        this.genişlik=genişlik;
        this.yükseklik=yükseklik;
        setRenk(renk);
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
    public  double getÇevre(){
        return 2*(genişlik*yükseklik);
    }

}
