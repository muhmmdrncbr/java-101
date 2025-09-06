import java.util.Scanner;
public class Teksayitoplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sayilar;
        int total=0;


        do {
            System.out.println("Sayiları Giriniz:");
            sayilar=input.nextInt();
            if(sayilar % 2==0 && sayilar % 4==0){
                total+=sayilar;
            }
        }while (sayilar %2==0);
        System.out.println("Toplam:"+total);

    }
}


