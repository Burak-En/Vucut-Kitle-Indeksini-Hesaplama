import java.util.Scanner;

public class main {
    public  static void main (String[] args) {
        double  kilo , boy ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (metre cinsinde) giriniz: " );
        boy=inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo=inp.nextDouble();


        double kitle =(kilo/(boy*boy));
        System.out.print("Vücut Kitle İndeksiniz: " + kitle);



    }

}
