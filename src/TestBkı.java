public class TestBkı {
    public static void main(String [] args){
        Bkı bkı1= new Bkı("yaman akbulut",43,84,1.73);
        System.out.println(bkı1.getIsim()+"için bkı" + bkı1.getBkı() + bkı1.getDurum());
        Bkı bkı2=new Bkı("diğer kişi",60,1.70);
        System.out.println(bkı2.getIsim() +" için" + bkı2.getBkı() + bkı2.getDurum());
    }
}
