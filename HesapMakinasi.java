import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz:");
        int sayi1= input.nextInt();

        System.out.println("İkinci Sayıyı Giriniz:");
        int sayi2=input.nextInt();

        System.out.println("1:Toplam\n2:Çıkarma\n3:Çarpma\n4:Bölme");
        System.out.println("Sonuç:");
        int İslem=input.nextInt();

       switch (İslem){
           case 1:
               System.out.println("Sonuç:"+sayi1+sayi2);
               System.out.println("İşlem Bşarılı Bir Şekilde Gerçekleşti");
               break;
           case 2:
               System.out.println("Sonuç:"+ (sayi1-sayi2));
               System.out.println("İşlem Bşarılı Bir Şekilde Gerçekleşti");
               break;
           case 3:
               System.out.println("Sonuç:"+sayi1*sayi2);
               System.out.println("İşlem Bşarılı Bir Şekilde Gerçekleşti");
               break;
           case 4:
               System.out.println("Sonuç:" + sayi1/sayi2);
               System.out.println("İşlem Bşarılı Bir Şekilde Gerçekleşti");
               break;

           default:
               System.out.println("Makinamız sadece Dört İşlem Yapmaktadır");
       }


    }
    }
