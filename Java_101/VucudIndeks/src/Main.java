import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu (kilogram cinsinden) giriniz : ");
        kilo = inp.nextInt();

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = inp.nextDouble();

        double indeks = kilo / (boy * boy);

        System.out.print("Vücut Kitle İndeksiniz : " + indeks);
    }
}
