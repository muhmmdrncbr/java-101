import java.util.Scanner;

public class DortAndBesKuvvet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int n;
       System.out.print("Lütfen Bir Sayi Giriniz:");
       n= input.nextInt();


        System.out.println("Dördün Kuvetleri");
        for (int i=1; i<=n; i*=4){
            System.out.println(+i);

        }
        System.out.println("Beşin Kuvetleri");

        for (int k=1; k<=n ; k*=5){
           System.out.println(k);

        }

    }
}
