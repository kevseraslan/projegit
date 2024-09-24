public class Try {
    public static void main(String[] args){
        System.out.println("program başladı");
        /*int a=0;
        try {
            a=2/0;
        }
        catch (ArithmeticException e){
            System.out.printf(e.getMessage());
        }
        System.out.println(a);
        System.out.printf("program bitti");

         */
        int []arr=new int[3];
        try {
            arr[4]=10;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}
