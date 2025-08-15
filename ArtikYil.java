import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Herhangi Bir Yıl Giriniz:");
       int yil=input.nextInt();

       boolean artikyil=(yil%400==0 || yil%4==0 && yil%100!=0);

       if (artikyil){
           System.out.print("Artik yıl");

       }else {
           System.out.print("Artik Yıl değil");

       }

    }

}
