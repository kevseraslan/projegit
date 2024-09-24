public class Bkı {
    private String isim;
    private  int yaş;
   private   double ağırlık;
    private  double boy;

    public Bkı(String isim, int yaş,double ağırlık,double boy ){
        this.isim=isim;
        this.yaş=yaş;
        this.ağırlık=ağırlık;
        this.boy=boy;

    }
    public Bkı(String isim,double ağırlık,double boy){
        this(isim,20,ağırlık,boy);

    }
   public double getBkı(){
        double Bkı=ağırlık/(boy*boy);
        return Math.round(Bkı*100)/100.0;

    }
public String getDurum(){
        double bkı=getBkı();
        if (bkı<18.5)
            return  "zayıf";
        else if (bkı<25)
            return "normal";
        else if (bkı<30)
            return "kilolu";
        else
            return  "obez";



        }
        public  String getIsim(){
        return isim;

}
public int getYaş(){
        return yaş;

}
public double getAğırlık(){
        return ağırlık;
}
public double getBoy(){
        return boy;
}
}
