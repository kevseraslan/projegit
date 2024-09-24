import java.util.*;

public class InputEx {
    public static void main(String[] args) {
        Scanner giriş = new Scanner(System.in);
        boolean girişeDevamEt = true;


        do {
            try {
                System.out.println("bir tam sayı giriniz. ");
                int number = giriş.nextInt();
                System.out.println("girilen sayı : " + number + "dır. ");
                girişeDevamEt = false;
            } catch (InputMismatchException ex) {
                System.out.println("tekrar deneyin. ( " + "geçersiz giriş. bir tam sayı girmeniz gerekiyor.)");
                giriş.nextLine();
            }
        }  while (girişeDevamEt);

    }
}