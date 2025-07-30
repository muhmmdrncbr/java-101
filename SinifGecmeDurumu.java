import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Not Bilgi Sistemine Hoşgeldiniz");
       // Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

        int toplam=0;
        int dersayi=0;
        System.out.print("Matematik Notunuz Nedir:");
        int mat=input.nextInt();
        if (mat>=0 && mat<=100){
            toplam+=mat;
            dersayi++;
        }

        System.out.print("Fizik Notunu Giriniz:");
        int fizik=input.nextInt();
        if(fizik>=0 && fizik<=100){
            toplam+=fizik;
            dersayi++;
        }

        System.out.print("Kimya Notunu Giriniz:");
        int kimya=input.nextInt();
        if(kimya>=0 && kimya<=100){
            toplam+=kimya;
            dersayi++;
        }

        System.out.print("Müzik Notunu Giriniz:");
        int muzuk=input.nextInt();
        if(muzuk>=0 && muzuk<=100){
            toplam+=muzuk;
            dersayi++;
        }
        System.out.print("Türkçe Notunu Giriniz:");
        int turkce=input.nextInt();
        if(turkce>=0 && turkce<=100) {
            toplam += turkce;
            dersayi++;
        }
            double ortalama=toplam/dersayi;

            if(ortalama<=55){
                System.out.println("Sınıfı Geçmediniz");
            }
            else {
                System.out.println("Tebrikler Sınıfı Geçtiniz;");
            }
        System.out.print("Sınıf Ortalamanız:"+ortalama);
    }
}
