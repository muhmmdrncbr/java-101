import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     int n;
     System.out.print("Bir Sayi Giriniz:");
     n=input.nextInt();

     double toplam=0.0;

     int k=1;

     while (n>=k){
        toplam +=(1.0/k);
       k++;
     }
     System.out.println(toplam);

    }
}
