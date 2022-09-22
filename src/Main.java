import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ksc = new Scanner(System.in);
        System.out.print("Basamak Sayısı Giriniz : ");
        int n = ksc.nextInt();
        for (int i = n; i >= 1; i--) {                 //Basamak Sayısı
            for (int j = (n - i); j >= 1; j--) {       //Kenar Boşluk Sayısı
                System.out.print(" ");
            }
            for (int k = (2 * i - 1); k >= 1; k--) {   //Yıldız Sayısı
                System.out.print("*");
            }
            System.out.println(" ");                   //Alt Satıra Geçmek

        }

    }
}