import java.math.*;
public class SıralaKarşılaştırabilirnesne {
public static void main(String [] args){
    String[] sehirler={"Savannah","Boston","Atlanta","Tampa"};
            java.util.Arrays.sort(sehirler);
    for (String sehir: sehirler)
        System.out.println(sehir+ "");
    System.out.println();
    BigInteger [] buyuksayılar={new BigInteger ("2323231092923992"),
    new BigInteger("432232323239292"),
    new BigInteger("5462329292")};
    java.util.Arrays.sort(buyuksayılar);
for (BigInteger sayı: buyuksayılar)
    System.out.println(sayı+ " ");
}
}
