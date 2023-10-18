
import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){
        Logİn login=new Logİn();
        Scanner scanner=new Scanner(System.in);
        System.out.println("kullanici girisi\n******************");
        int girishakki=3;
            while (true) {
                if(login.Login(hesap)){
                    System.out.println("giris basarili");
                    break;
                    
                }
                else{
             girishakki--;   
            System.out.println("yanlis girdiniz.kalan giris hakkınız:"+girishakki);
                    
                }
                if(girishakki==0){
                    System.out.println("tekrar giris yapmayi deneyemezsiniz.giris hakkiniz kalmamistir...");
                    return;
                }
            
        }
            System.out.println("****************");
            String islemler="1.bakiye görüntüle\n"+
                            "2. para yatirma\n"+
                            "3.para cekme\n"+
                            "4.cikmak icin q'ya basin";
            System.out.println(islemler);
            System.out.println("****************");
         
            while (true) {
                System.out.println("islemi seciniz.");
                String islem=scanner.nextLine();
                if(islem.equals("q")){
                    break;
                }
                else if(islem.equals("1")){
                    System.out.println("guncel bakiyeniz:"+hesap.getBakiye());
                           
                }
                else if(islem.equals("2")){
                    System.out.println("yatirmak istediğiniz tutar:");
                    int miktar=scanner.nextInt();
                    scanner.nextLine();
                    hesap.ParaYatir(miktar);  
                }
                else if(islem.equals("3")){
                    System.out.println("cekmek istediginiz miktari giriniz:");
                    int miktar=scanner.nextInt();
                    scanner.nextLine();
                    hesap.ParaCek(miktar);
                    
                }
                else{
                    System.out.println("gecersiz islem girisi yaptiniz...");
                }
            
        }
        
    }
    
}
