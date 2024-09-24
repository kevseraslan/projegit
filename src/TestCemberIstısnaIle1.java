public class TestCemberIstısnaIle1 {
    public static void main(String[] args){
try {

    CemberIstısnaIle1 c1=new CemberIstısnaIle1(5);
    CemberIstısnaIle1 c2=new CemberIstısnaIle1(-5);
    CemberIstısnaIle1 c3=new CemberIstısnaIle1(0);
}
catch (IllegalArgumentException ex) {
    System.out.println(ex);
}
        System.out.println("oluşturulan nesne sayısı :" +CemberIstısnaIle1.getNesnesayısı());
    }
}
