import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenlerimizi oluşturalım.
        int a,b,c,cevre;
        double alan,s;

        // Kullanıcıdan verilerimizi alalım.
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = girdi.nextInt();
        System.out.print("3. Kenarı Giriniz : ");
        c = girdi.nextInt();

        cevre = a + b + c;
        s = (cevre / 2);

        alan = Math.sqrt(s * (s-a)*(s-b)*(s-c));
        System.out.print("Üçgenin Alanı : " + alan);
    }
}
