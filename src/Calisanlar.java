
public class Calisanlar {
    private String ad;
    private String soyad;
    private int id;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calisanlar(String ad, String soyad, int id) {// bu satırlar
        this.ad = ad;                                 // constructor a basınca
        this.soyad = soyad;                         // geldi
        this.id = id;                             // ve super ile yazilimci clasında bu satırları çağırdık.
    }
    public void bilgileriGoster(){
        System.out.println("Calısan bilgileri...");
        System.out.println("adı: " + ad);
        System.out.println("soyad: " + soyad);
        System.out.println("ID: " + id );
        
    
    }
    
}
