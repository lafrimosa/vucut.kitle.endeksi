import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner girdi= new Scanner(System.in);

        System.out.println(" lütfen boyunuzu metre cinsi olarak giriniz: ");
        double boy = girdi.nextDouble();

        System.out.println(" lütfen kilonuzu kg cinsi olarak giriniz: ");
        int kilo = girdi.nextInt();

        double vke= kilo / (boy * boy);
        System.out.print("vücut kitle endeksiniz: "+ vke);

        
    }
}