import matematik.DortIslem;
import matematik.Logaritma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Adınız ;");

    String isim = scanner.nextLine();
    System.out.println(" Merhaba : " + isim);

    DortIslem DortIslem = new DortIslem();
    DortIslem.topla(7,8);

    Logaritma Logaritma = new Logaritma();
        double logaritmahesapla = Logaritma.logaritmahesapla();


    }
}