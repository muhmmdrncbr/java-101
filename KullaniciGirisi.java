import java.util.Scanner;


public class KullaniciGirisi {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String kullaniciAdi,sifre;

    System.out.println("Kullanici Adi Giriniz:");
    kullaniciAdi=input.nextLine();

    System.out.println("Şifre Giriniz:");
    sifre=input.nextLine();

    if (kullaniciAdi.equals("Gumos.emo")){
      if (sifre.equals("Gumme.123")){
          System.out.println("Sisteme Hoşgeldiniz");
        }
        else {
            System.out.println("Şifre Yanlış:Şifreyi Sfırlamak İstermisiniz");
            String cevap=input.nextLine();

            if (cevap.equals("Evet")){
                System.out.println("Yeni Şifreyi Giriniz:");
                String yeniSifre=input.nextLine();

                if (yeniSifre.equals(sifre="Gumos.144")){
                    System.out.println("Şifreniz Eski Şifreyle Aynı Lütfen Başka Bir Şifre Giriniz");
                }
                else {
                    System.out.println("Şifreniz Başarılı Bir Şekilde  Değiştirildi");
                }
            }
      }
    }
    else {
        System.out.println("Kullanici Adı  Yanlış");
    }
    }
}
