package AtmProgrami;
import java.util.Scanner;

public class Atm {
    private static Object quit;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rightOfEntry = 3;
        int remnant = 45000;
        int money =0;
        int selection;
        String choose;
        boolean T = true;
        boolean F = false;


        String userName, password;
        while (rightOfEntry > 0) {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("celebiimert") && password.equals("Antigs1907.")) {
                System.out.println("Merhabalar! Sisteme giris yaptiniz.");
                System.out.println("Bankamizda gecici bir aksaklik nedeniyle sadece para cekme ve yatirma islemleri yapilabilmektedir!!! ");
                do {
                    System.out.print("Yapmak istediginiz islemi seciniz.\n" + "1-Para Cekme\n" + "2-Para Yatirma\n" + "3-Cikis\n" + " ");
                    System.out.print("Islem: ");
                    selection = input.nextInt();
                    System.out.println("Yapmak istenilen islem: " + selection);
                    System.out.println("Yapilmak istenen islem Dogru ise " + "T " +
                            "i yanlis ise " + "F " + "yi seciniz.");
                    choose = input.nextLine();
                    System.out.println(choose);
                    if (T) {
                        System.out.println(choose + "dogru giris.");
                        if(selection == 1){
                            System.out.print("Para Çek: ");
                            money = input.nextInt();
                            remnant = remnant -money;
                            System.out.println("Paraniz hazirlaniyor: " + money + "TL");
                            System.out.println("Parayi gösterilen sekilde alabilirsiniz.\n" +
                                    "Hesapta kalan tutar: " + remnant);
                        } else if ( selection == 2) {
                            System.out.println("Hesabinizda " + remnant + " TL bulunmaktadir.");
                            System.out.print("Yatirilmak istenen tutari giriniz: ");
                            money = input.nextInt();
                            remnant = remnant + money;
                            System.out.println("Paraniz yatiriliyor: " + money + "TL");
                            System.out.println("Parayi ekranda goruldugu gibi bankamatige yerlestiriniz\n" +
                                    "Hesapta biriken tutar: " + remnant);
                        } else {
                            System.out.println("Sistemden cikis yapiliyor.");
                            final Object quit1 = quit;
                            break;
                        }
                    } else {
                        System.out.println(choose + "yanlis giris.");
                        System.out.println("tum islemleri yeniden yapiniz iyi gunler.");
                        final Object quit1 = quit;
                    }
                } while (choose != "T");
                    break;
            } else {
                System.out.println("Username yada Password hatali. Tekrar deneyiniz.");
                if (rightOfEntry == 0) {
                    System.out.println("Cok fazla hatali giris yaptiniz. Guvenliginiz icin hesabiniz bloke edilmistir.");
                    final Object quit1 = quit;
                } else {
                    System.out.println("Kalan deneme hakkiniz: " + --rightOfEntry);
                }
            }
        }
    }
}