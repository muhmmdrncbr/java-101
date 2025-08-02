import java.util.Scanner;
public class burcBulma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ay, gun;

        System.out.print("Hangi Ayda Doğdunuz:");
        ay = input.nextInt();

        System.out.print("Doğdunuz Gün Nedir:");
        gun = input.nextInt();


        if (ay > 0 && ay <= 12 && gun>0 && gun<=31) {

             if (ay == 1 && gun < 22) {
                    System.out.print("Burcunuz Oğlak");
                } else if (ay == 2 && gun < 20) {
                    System.out.print("Burcunuz Kova");
                } else if (ay == 3 && gun < 21) {
                    System.out.print("Burcunuz Balık");
                } else if (ay == 4 && gun < 21) {
                    System.out.print("Burcunuz Koç");
                } else if (ay == 5 && gun < 22) {
                    System.out.print("Burcunuz Boğa");
                } else if (ay == 6 && gun < 23) {
                    System.out.print("Burcunuz İkizler");
                } else if (ay == 7 && gun < 23) {
                    System.out.print("Burcunuz Yengeç");
                } else if (ay == 8 && gun < 23) {
                    System.out.print("Burcunuz Aslan");
                } else if (ay == 9 && gun < 23) {
                    System.out.print("Burcunuz Başak");
                } else if (ay == 10 && gun < 22) {
                    System.out.print("Burcunuz Terazi");
                } else if (ay == 11 && gun < 22) {
                    System.out.print("Burcunuz Akrep");
                } else if (ay == 12 && gun < 22) {
                    System.out.print("Burcunuz Yay");
                } else
                    System.out.print("Burcunuz oğlak");
            } else
                System.out.print("ay ve Gün Kısmını Doğru Giriniz");
        }
    }


