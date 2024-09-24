public class BasıtÇember {
    double yarıçap;
    BasıtÇember() {
        yarıçap=1;
    }
    BasıtÇember(double yeniyarıçap){
        yarıçap=yeniyarıçap;

    }
    double getAlan(){
        return Math.PI*yarıçap*yarıçap;
    }
    double getÇevre(){
        return 2*Math.PI*yarıçap;
    }
    void setYarıçap(double yeniyarıçap){
        yarıçap=yeniyarıçap;
    }
}
