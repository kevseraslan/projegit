public class Tv {
    int kanal=1;
    int sesSeviyesi=1;
    boolean açık=false;

public  Tv(){
    }
    public void  aç(){
    açık=true;
    }
    public void kapat(){
    açık=false;
    }
    public void setKanal(int yeniKanal){
    if(açık &&yeniKanal>=1 && yeniKanal<=120)
        kanal=yeniKanal;
    }
    public void setSesSeviyesi(int yeniSesSeviyesi){
    if (açık && sesSeviyesi>=1 && sesSeviyesi<=7) {
        sesSeviyesi=yeniSesSeviyesi;
    }

    }
    public void kanalYukarı(){
    if (açık && kanal<120)
        kanal++;
    }
    public void kanalAşağı(){
    if (açık && kanal>1)
        kanal--;
    }
    public void sesArttır(){
    if(açık && sesSeviyesi<7)
        sesSeviyesi++;
    }
    public void sesAzalt(){
    if (açık && sesSeviyesi>1)
        sesSeviyesi--;
    }
}
