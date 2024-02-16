import java.util.Scanner;
// dairenin açısını ve yarı çapını girerek oluşan daire alanı hesaplaması
public class Main {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");

        System.out.print("\nDairenin açısını giriniz : ");

        r = inp.nextInt();
        a = inp.nextInt();
        double alan = (pi * (r * r) * a)/360;

        System.out.println("Dairenin alanı : " + alan);

    }
}
