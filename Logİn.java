
import java.util.Scanner;


public class Logİn {
    public boolean Login(Hesap hesap){
        Scanner scanner=new Scanner(System.in);
        System.out.print("kullanici adinizi giriniz:");
        String kullaniciadi=scanner.nextLine();
        System.out.print("parolanizi giriniz:");
        String parola=scanner.nextLine();
        if(hesap.getKullaniciadi().equals(kullaniciadi)&& hesap.getParola().equals(parola)){
            return true;
        }
        else{
           /* int girishakki=3;
            girishakki--;   
            System.out.println("yanlis girdiniz.kalan giris hakkınız:"+girishakki); */
           return false;
        }
        
    }
    
}
