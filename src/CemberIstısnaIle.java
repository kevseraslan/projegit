public class CemberIstısnaIle {
    private double yarıçap;
    private static int nesneSayısı=0;

    public CemberIstısnaIle(){
        this(1.0);
    }
    public CemberIstısnaIle(double yeniyarıçap){
        setYarıçap(yeniyarıçap);
        nesneSayısı++;
    }
    public double getYarıçap(){
        return yarıçap;
    }
    public void setYarıçap(double yeniyarıçap) throws IllegalArgumentException {

        if (yeniyarıçap >= 0)
            yarıçap = yeniyarıçap;
        else
            throw new IllegalArgumentException("yarıçap negatif olamaz ");
    }
        public static int getnesnesayısı(){
    return nesneSayısı;
        }
        public double getAlan() {
    return Math.PI*yarıçap*yarıçap;
        }
        }

