
public class ATM_programi {

    public static void main(String[] args) {
        ATM atm=new ATM();
        Hesap hesap=new Hesap("sumeyye","123456", 2000);
        atm.calis(hesap);
        System.out.println("programdan cikiliyor...");
    }
}
