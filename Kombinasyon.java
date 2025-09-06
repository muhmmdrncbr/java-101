import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n sayısını giriniz: ");
        int n = input.nextInt();

        System.out.print("r sayısını giriniz: ");
        int r = input.nextInt();

        if (r > n || n < 0 || r < 0) {
            System.out.println("Geçersiz değerler!");
            return;
        }

        int faktoriyel = 1;


        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }
        int faktoriyelN = faktoriyel;


        faktoriyel = 1;
        for (int i = 1; i <= r; i++) {
            faktoriyel *= i;
        }
        int faktoriyelR = faktoriyel;


        faktoriyel = 1;
        for (int i = 1; i <= (n - r); i++) {
            faktoriyel *= i;
        }
        int faktoriyelNR = faktoriyel;

        int kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelNR);
        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
    }
}
