import java.util.Scanner;
public class TestArttır {
    public static void main(String [] args){
int x=1;
        System.out.println("metodun çağırmadan önce x:" +x);
        arttır(x);
        System.out.println("metodu çağırdıktan sonra x:"+x);

    }
    public static void arttır(int n){
        n++;
        System.out.println("metodun içinde n: " +n);
    }
}
