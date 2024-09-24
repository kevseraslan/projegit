import java.math.*;
public class Karsılastırma {
    public static void main(String[] args) {
        String[] sehırler = {"elazığ", "sivas", "istanbul", "izmir"};
        java.util.Arrays.sort(sehırler);
        for (String sehır : sehırler)
            System.out.println(sehır + " ");
        System.out.println();


        BigInteger[] buyuksayı = {new BigInteger("12345"),
                new BigInteger("123456"),
                new BigInteger("1234567"),};
        java.util.Arrays.sort(buyuksayı);
        for (BigInteger sayı: buyuksayı)
            System.out.println(buyuksayı +" ");
    }
}