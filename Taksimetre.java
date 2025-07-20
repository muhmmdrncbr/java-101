import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       System.out.print("Taksimetre Açılış Ücreti=");
       double tacılıs=10;
       System.out.println(tacılıs);

       double kmucret=2.20;
       double minhesap=20;
       double gidilenkm;
       System.out.print("Kaç km gittik=");
       gidilenkm=input.nextDouble();

       double hesap=tacılıs+kmucret*gidilenkm;


       if (hesap<minhesap){

           hesap=minhesap;

       }
       System.out.print("Hesabınız="+hesap+ "TL");
    }
}
