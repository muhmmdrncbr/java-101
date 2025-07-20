import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      double kenarA,kenarB,kenarC;

      System.out.print("A kenarını giriniz=");
      kenarA=input.nextDouble();

      System.out.print("B kenarını giriniz=");
      kenarB=input.nextDouble();

      System.out.print("C kenarını giriniz=");
      kenarC=input.nextDouble();

      double u= (kenarA + kenarB + kenarC)/2;

      double cevre=2*u;
      System.out.println("üçgenin Çevresi="+cevre);

      double alan=Math.sqrt(u*(u-kenarA)*(u-kenarC)*(u-kenarB));
      System.out.println("Üçgenin Alanı="+alan);


    }
}
