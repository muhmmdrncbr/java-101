import java.util.Scanner;

public class UsluSayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi,us;

        System.out.print("Üsü Alınacak Sayi:");
        sayi=input.nextInt();

        System.out.print("Üs:");
        us=input.nextInt();

        int islem =1;

        for(int i=1; i<=us; i++){
            islem *=sayi;


        }
        System.out.println("Cevap="+ islem);



    }
}
