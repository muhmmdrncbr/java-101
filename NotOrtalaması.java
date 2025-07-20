import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("NOT LİSTESİ");

        int matematik, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik Notunuz = ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz = ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz = ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz = ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz = ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz = ");
        muzik = input.nextInt();

        double ortalama = (matematik * 0.3) + (fizik * 0.2) + (kimya * 0.15) +
                (turkce * 0.15) + (tarih * 0.12) + (muzik * 0.08);

        System.out.println("Not Ortalamanız = " + ortalama);

        // Ternary operator ile sonuç
        System.out.println(ortalama >= 60 ? "SINIFI GEÇTİ" : "KALDI");
    }
}
