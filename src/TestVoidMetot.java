import java.util.Scanner;
public class TestVoidMetot {
    public static void main(String[] args) {
        System.out.println("not değeri:");
        notYazdır(101);
    }

    public static void notYazdır(double dersNotu) {
        if (dersNotu < 0 || dersNotu > 100){
            System.out.println("ders notu geçersiz");
        return;
    } if (dersNotu >= 90) {
            System.out.println("A");
        } else {
            System.out.println("F");
        }
    }
}