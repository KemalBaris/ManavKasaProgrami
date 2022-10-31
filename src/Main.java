import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       double akg, ekg, dkg, mkg, pkg, akgm = 2.14, ekgm = 3.67, dkgm = 1.11, mkgm = 0.95, pkgm = 5.0;
       Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo : ");
        akg = input.nextDouble();
        System.out.print("Elma Kaç Kilo : ");
        ekg = input.nextDouble();
        System.out.print("Domates Kaç Kilo : ");
        dkg = input.nextDouble();
        System.out.print("Muz Kaç Kilo : ");
        mkg= input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo : ");
        pkg = input.nextDouble();


        double total = (akgm * akg) + (ekgm * ekg) + (dkgm * dkg) + (mkg * mkgm) + (pkg * pkgm);
        System.out.print("Toplam Tutar : " + total);
    }
}