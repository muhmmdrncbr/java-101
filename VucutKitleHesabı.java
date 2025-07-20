import java.util.Scanner;

public class VucutKitleHesabı {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    double boy,kilo;

    System.out.print("Boyunuz kaç metre=");
    boy=input.nextDouble();

    System.out.print("Kilonuz nedir=");
    kilo=input.nextDouble();

    double kitleİndeksi=kilo/(boy*boy);
    System.out.println("Vücut Kitle İndeksiniz="+kitleİndeksi);

    }
}
