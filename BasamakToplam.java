import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     int sayi,geciciSayi;
     System.out.print("Bir Sayi Giriniz=");
     sayi=input.nextInt();


     int toplam=0;
     geciciSayi=sayi;

     while (geciciSayi>0){
         int basamak=geciciSayi%10;
         toplam +=basamak;
         geciciSayi /=10;

     }
     System.out.println("Basamaktaki Sayılarının Toplami="+toplam);
    }
}
