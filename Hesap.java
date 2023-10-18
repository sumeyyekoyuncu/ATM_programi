
public class Hesap {
    private String Kullaniciadi;
    private String Parola;
    private double Bakiye;
    
    
    
     public Hesap(String Kullaniciadi, String Parola, double Bakiye) {
        this.Kullaniciadi = Kullaniciadi;
        this.Parola = Parola;
        this.Bakiye = Bakiye;
    }
    public String getKullaniciadi() {
        return Kullaniciadi;
    }

    public void setKullaniciadi(String Kullaniciadi) {
        this.Kullaniciadi = Kullaniciadi;
    }

    public String getParola() {
        return Parola;
    }

    public void setParola(String Parola) {
        this.Parola = Parola;
    }

    public double getBakiye() {
        return Bakiye;
    }

    public void setBakiye(double Bakiye) {
        this.Bakiye = Bakiye;
    }
    public void ParaYatir(int miktar){
        Bakiye+=miktar;
        System.out.println("yeni bakiyeniz:"+Bakiye);
 }
    public void ParaCek(int miktar){
        if(miktar>Bakiye){
            System.out.println("hesabinizda bu kadar para yok...Bakiyeniz:"+Bakiye);
        }
        else{
            Bakiye=Bakiye-miktar;
            System.out.println("yeni bakiyeniz:"+Bakiye);
        }
    }
   
    
}
