
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in);
        System.out.println("calısanlar sınıfına hoşgeldiniz...");
        
        String islemler = "islemler...\n"
                          +"1. Yazilimci islemleri\n"
                          +"2. Yonetici islemleri\n"
                          + "Çıkış için q'ya basın";
        
        System.out.println("***************************");
        System.out.println(islemler);
        System.out.println("***************************");
        
        while (true) {            
            System.out.print("İslemi seçiniz: ");
            islemler = scanner.nextLine();
            
            if(islemler.equals("q")){
                System.out.println("İslemden çıkılıyor...");
                break;
            
            }
/* 38 */        else if (islemler.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Alperen","Sürücü", 1214, "Python, C, Java");
                String yazilimci_islem = "1. format at\n"
                                          +"2. bilgileri gösre\n"
                                          +"Çıkış için q' ya basın...";
                System.out.println(yazilimci_islem);
                
                while (true) {
                    System.out.println("işlemi seçimiz...");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")) {
                        
                        System.out.println("yazilimci işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        
                        System.out.println("isletim sistemi: ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formAt(isletim_sistemi);
                            
                    }
                    else if (y_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                    
                    } 
                    else{
                        System.out.println("geçersiz yazilimci islemi...");
                    }
              
                    }
               
                }
            else if (islemler.equals("2")){
                
            Yonetici yonetici = new Yonetici("semih", "er", 1213, 10);
            String yonetici_islem = "yönetici islmleri\n"
                                    +"1. zay yap\n"
                                    +"2. bilgileri göster\n"
                                    + "çıkış için q' ya basınız...";
                System.out.println(yonetici_islem);
                
            while (true) {            
                    System.out.print("İslemi seçiniz: ");
                    String y_islem = scanner.nextLine();
                if (y_islem.equals("q")) {
                        
                        System.out.println("yazilimci işlemlerinden çıkılıyor...");
                        break;
             }       
                 else if (y_islem.equals("1")) {
                          
                          System.out.println("yöneticinin ne kadar zamn yapmasını istiyorsun...");
                          int zamMiktari = scanner.nextInt();
                          scanner.nextLine();
                          yonetici.zamYap(zamMiktari);
                       
                   }
                else if (y_islem.equals("2")) {
                          
                          yonetici.bilgileriGoster();
                     
                   }
                   
               else{
                      
                        System.out.println("geçersiz yönetici islemi...");
     
                }
                
           }
                 
                }
            
              else {
                    
                    
                 System.out.println("geçersiz islem...");
                    
            }
            
            }
      
        }

    }
    

