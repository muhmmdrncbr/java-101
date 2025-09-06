import java.util.Scanner;
public class SayiKlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        System.out.print("Lütfen Bir sayı Giriniz: ");
        sayi=input.nextInt();

        for(int k=0; k<=sayi; k++) {
            if (k % 3==0 && k % 4==0) {
                System.out.println(k);
            }


        }
    }
}
