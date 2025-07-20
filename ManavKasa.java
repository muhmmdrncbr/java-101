import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      double armut,elma,domates,patlıcan,muz;

      System.out.print("Armut Kg=");
      armut=input.nextDouble();

      System.out.print("Elma Kg=");
      elma=input.nextDouble();

      System.out.print("Domates Kg=");
      domates=input.nextDouble();

      System.out.print("Patlıcan Kg=");
      patlıcan=input.nextDouble();

      System.out.print("Muz Kg=");
      muz=input.nextDouble();


      double tOdeme=armut*2.14+ elma*3.67+ domates*1.11+ muz*0.95+patlıcan*5;
      System.out.print("Toplam Ödeme Tutarı="+tOdeme+"TL");

    }
}
