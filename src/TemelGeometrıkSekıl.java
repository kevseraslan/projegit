public class TemelGeometrıkSekıl {
    private String renk;
    private boolean dolgu;
    private java.util.Date oluşturulmaTarihi;

    TemelGeometrıkSekıl() {
    }
    TemelGeometrıkSekıl(String renk,boolean dolgu){
        }
        public String getRenk() {
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
            public String toString(){
        return "oluşturulmaTarihi"+oluşturulmaTarihi+"renk"+renk+   "dolgu "+dolgu;
            }

        }


