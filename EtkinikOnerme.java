import java.util.Scanner;

public class EtkinikOnerme {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Sıcaklık Kaç C°: ");
    int sicaklik=input.nextInt();
    

    if (sicaklik>25){
    System.out.println("Yüzme yapabilirsiniz");

    }
     else if (sicaklik>=5 && sicaklik<=25) {
        if(sicaklik<15){
            System.out.println("Sinemaya Gidebilirsiniz");
        }if (sicaklik>10){
            System.out.println("Pikniğe Gidebilirsiniz");
        }

    }else
        System.out.println("Kayak Yapabilirsiniz");
    }
}
