import java.util.Scanner;
public class sayiSiralama {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int sayi1, sayi2, sayi3;

     System.out.print("Birinci Sayiyi Giriniz:");
     sayi1=input.nextInt();

     System.out.print("İkinci Sayiyi Giriniz:");
     sayi2=input.nextInt();

     System.out.print("Üçüncü Sayiyi Grirniz:");
     sayi3=input.nextInt();

     if (sayi1<sayi2 && sayi1<sayi3){
         if(sayi2<sayi3){
             System.out.print("Sayi1<Sayi2<Sayi3");
         }else
             System.out.print("Sayi1<Sayi3<Sayi2");
     } else if (sayi2<sayi1 && sayi2<sayi3) {
         if (sayi1<sayi3){
             System.out.print("Sayi2<Sayi1<Sayi3");
         }else
             System.out.print("Sayi2<Sayi3<Sayi1");

     } else if (sayi3<sayi1 && sayi3<sayi2) {
         if (sayi1<sayi2){
             System.out.print("Sayi3<Sayi1<Sayi2");
         }else
             System.out.print("Sayi3<Sayi2<Sayi1");
     }

    }
}
