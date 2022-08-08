import java.util.Scanner;

public class I_KDV_Tutari_Hesaplayan_Program {
    public static void main(String[] args) {

        // Kullanıcının para bilgisi
        double tutar,kdvOran = 0.18, kdvTutari, kdvliTutar;

        //Scanner sınıf tanımlama
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değer alma;
        System.out.print("Paranizi Giriniz: ");
        tutar = inp.nextDouble();

        // Degelerle işlemler;
        kdvTutari = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutari;
        // Tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8
        kdvOran = tutar <= 1000 ? 0.18 : 0.8;

        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Orani :" + kdvOran);
        System.out.println("KDV Tutari :" + kdvTutari);
        System.out.println("KDV'li Tutar :" + kdvliTutar);
    }
}
