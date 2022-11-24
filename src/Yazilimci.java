
public class Yazilimci extends Calisanlar{
    private String diller;  // özellik ekledik 
    

    public Yazilimci(String ad, String soyad, int id, String diller) {  // dilleri ektra sonradan ekledik
        super(ad, soyad, id);// super anahtar kelimesi ile bir üst class ın constructor ini çağırabilecek.
        this.diller = diller;     // constructor da sonradan diller eklemek gerekti . özellik olarak sonradan ekleyince 
        
        
    }
    public void formAt(String isletim_sistemi){
        System.out.println(getAd() +"" + isletim_sistemi+ "ni yükliyor...");
      
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("yazilimcinin bildiği diller: " + diller);
    }
    
    
}
