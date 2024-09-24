public class TestCemberIstısnaIle {
    public static void main(String[] args){
        try {
            CemberIstısnaIle c1=new CemberIstısnaIle(5);
            CemberIstısnaIle c2=new CemberIstısnaIle(-5);
            CemberIstısnaIle c3=new CemberIstısnaIle(0);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        System.out.println("oluşturulan nesne sayısı: " +CemberIstısnaIle.getnesnesayısı());
    }
}
