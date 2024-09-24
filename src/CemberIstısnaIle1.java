public class CemberIstısnaIle1 {
    private double yarıçap;
    private static int nesnesayısı=0;

    public CemberIstısnaIle1(){
        this(1);
    }
public CemberIstısnaIle1(double yeniyarıçap){
        setYarıçap(yeniyarıçap);
        nesnesayısı++;
}
public double getYarıçap(){
        return yarıçap;
}
public void setYarıçap(double yeniyarıçap) throws IllegalArgumentException {
            if (yeniyarıçap>=0)
                yarıçap=yeniyarıçap;
            else
                throw  new IllegalArgumentException("yarıçap negatif olamaz. ");
    }


public static int getNesnesayısı(){
        return nesnesayısı;
}
public double alanHesapla(){
        return Math.PI*yarıçap*yarıçap;
}
}
