import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi=3.14;

        double yarıcap;
        System.out.print("Dairenin Yarıçapı=");
        yarıcap=input.nextDouble();

        double alan=pi*yarıcap*yarıcap;
        System.out.println("Dairenin Alanı="+alan);

        double cevre=2*yarıcap*pi;
        System.out.println("Dairenin Çevresi="+cevre);


        System.out.println("Daire Dilimi Alanı Hesabı");

        int acı;
        System.out.print("Açı Ölçüsü=");
        acı=input.nextInt();

        double dilimacı=(pi*(yarıcap*yarıcap)*acı)/360;
        System.out.println("Verilen Dilimin Alanı="+dilimacı);
    }
    }
