import java.util.Scanner;
public class SıralıToplam {
    public static int top(int i1, int i2) {
int sonuç=0;
for (int i=i1;i1<=i2;i++)
    sonuç+=i;
return sonuç;
    }

    public static void main(String[] args) {
        System.out.println("1dan 10 e kadar olan sayıların toplamı: "+top(1,10));
        System.out.println(" 10dan 27 e kadar olan sayıların toplamı: "+top(10,27));

    }
}