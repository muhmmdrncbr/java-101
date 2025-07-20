import java.util.Scanner;

public class KdvOran {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       double fiyat;
       System.out.print("Ürünün kdvsiz fiyatı=");
       fiyat=input.nextDouble();
       double kdv;



       if (fiyat > 0 && fiyat <= 1000){
           kdv=0.18;

       }
       else if (fiyat>1000){
           kdv=0.08;
       }
       else{
           System.out.println("Geçersiz fiyat");
           return;
       }
        double kdvfiyat;
        kdvfiyat=fiyat+(fiyat*kdv);
        System.out.print("Ürünün Yeni Fiyatı="+kdvfiyat);
    }
}
