import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        //değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        //scanner sınıfını tanımla
        Scanner inp =new Scanner(System.in);

        //kullanıcıdan değerleri al

        System.out.print("matematik notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.print("fizik notunuzu giriniz: ");
        fizik = inp.nextInt();

        System.out.print("kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.print("turkce notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("tarih notunuzu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("muzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ort = toplam / 6.0;
        System.out.println("ortalamanız: " + ort);

        int a = 60;
        boolean kosul1 = ort==a;
        boolean kosul2 = ort>a;

        boolean sonuc = (kosul1 || kosul2 ) ;
        boolean sonuc2 = !(ort ==a || ort>a);


        String str = sonuc ? "sınfı geçti" : "sınıfta kaldı";
        System.out.println(str);







    }
}