import java.util.InputMismatchException;
import java.util.Scanner;
public class INPUT {
    public static void main(String []args){
        Scanner giriş=new Scanner(System.in);
        boolean girişedevamet =true;
        do {
            try{
                System.out.println("bir tam sayı giriniz:");
                int number =giriş.nextInt();

                System.out.println("girilen sayı"+number+"dır");
                girişedevamet =false;

            }
catch (InputMismatchException ex) {
    System.out.println("tekrar deneyin bir giriş gerekiyor");
}
        } while (girişedevamet);
    }

}
