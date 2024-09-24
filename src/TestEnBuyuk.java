import java.util.Scanner;
public class TestEnBuyuk {
    public static void main(String[] args) {
       int i=5;
       int j=7;
       int k=enBuyuk(i,j );
        System.out.println(i+"ve"+ j +"den büyük olan" +k);



    }
    public static int enBuyuk(int sayı1,int sayı2){
        int sonuç;
        if (sayı1>sayı2)
            sonuç=sayı1;
        else
            sonuç=sayı2;
return  sonuç;
    }
}
