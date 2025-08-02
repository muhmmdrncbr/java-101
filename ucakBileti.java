import java.util.Scanner;
public class ucakBileti {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int km,yas,yolculukT;

    System.out.print("Mesafeyi km Türünden Giriniz:");
    km=input.nextInt();

    System.out.print("Yaşınız Giriniz:");
    yas=input.nextInt();

    System.out.print("( 1>>>Tek Yön ,  2>>>Gidiş Dönüş):");
    yolculukT=input.nextInt();

    double NormalTutar=km*(0.10);
    double yasİndrimi=0;
    double gidisdonusİndirim=0;


    if (km>0 && yas>0 && (yolculukT==1 || yolculukT==2)){
        System.out.println("Normal Tutar:"+NormalTutar+"TL");
        if (yas<12){
            yasİndrimi=NormalTutar/2;
            System.out.println("Yaş İndrimi:"+yasİndrimi+"TL");
        }
        if (yas>=12 && yas<24){
            yasİndrimi=(NormalTutar/10);
            System.out.println("Yaş İndrimi:"+yasİndrimi+"TL");
        }
        if (yas>65){
            yasİndrimi=(NormalTutar/10*3);
            System.out.println("Yaş İndirimi:"+yasİndrimi+"TL");
        }
    } else {
        System.out.print("Hatalı Veri Girdiniz");
    }


    double indrimliTutar=NormalTutar-yasİndrimi;
    System.out.println("İndirimli Tutar:"+indrimliTutar+"TL");
    double toplamTutar=indrimliTutar;

    if (yolculukT==2){
        gidisdonusİndirim=indrimliTutar*0.20;
        System.out.println("Gidiş Dönüş Bilet İndirimi:"+gidisdonusİndirim+"TL");
        toplamTutar=(indrimliTutar-gidisdonusİndirim)*2;

    }
    System.out.print("Toplam Tutar:"+toplamTutar+"TL");

    }
}