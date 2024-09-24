public class Test5 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.p(10);
        a.p(10.0);
        a.p("yazılım mühendisliği");
    }
}

        class B{
public void p(double i){
    System.out.println(i*2);

}
        }
        class A1 extends B{
            public void p(double i){
                System.out.println(i*3);

            }
            public void p(String yazı){
                System.out.println("merhaba" +yazı+"\nmerhaba"+yazı);
            }
        }


