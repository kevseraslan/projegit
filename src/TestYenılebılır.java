public class TestYenılebılır {
        public static void main(String[] args){
            Object[] nesneler={new Kaplan(),new Tavuk(), new Elma()};
            for (int i=0;i<nesneler.length;i++) {
                if (nesneler[i] instanceof Yenılebılır) {
                    System.out.println(((Yenılebılır) nesneler[i]).nasılYenir());
                }
                if(nesneler[i] instanceof Hayvan){
                    System.out.println(((Hayvan)nesneler[i]).ses());
            }
        }
    }

}
interface Yenılebılır {
    String nasılYenir();
}

abstract class Hayvan {
    public abstract String ses();
}
class Tavuk extends Hayvan implements Yenılebılır{
    @Override
    public String nasılYenir() {

        return "tavuk : kızartma yap";
    }
    @Override
    public String ses(){
        return "tavuk gıt gıt gıdak";
    }
}

class Kaplan extends Hayvan {
    @Override
    public String ses (){
        return "kaplan roo";
    }
}
abstract class Meyve implements Yenılebılır{

}
class  Elma extends Meyve {

    @Override
    public String nasılYenir() {

        return "elma : elma suyu yapalım.";
    }
}
class Portakal extends Meyve {
    @Override
    public String nasılYenir() {
        return "portakal: portakal suyu yapalım";
    }
}