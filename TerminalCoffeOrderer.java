import java.util.List;
import java.util.Scanner;

/**
 * TerminalCoffeOrderer
 * Terminalden kahve siparişi almak için implement edildi 
 */
public class TerminalCoffeOrderer implements ICoffeOrderer{

    private CoffeType[] coffes;

    // Tüm kahve tiplerini listeye atar.
    public TerminalCoffeOrderer() {
        coffes = CoffeType.values();
    }

    // Tüm kahve tiplerini ücretleriyle basar
    @Override
    public void presentCoffeMenu() {
        
        Integer i=0;
                
        for (CoffeType coffeType : coffes) 
        {
            String item = String.format("%d.%s (%d ₺)", ++i, coffeType, coffeType.getPrice());
            System.out.println(item);
        }

    }

    // İstenilen kahve tipini kullanıcıdan alır ve CoffeType olarak döndürür.
    @Override
    public CoffeType takeOrder() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen içmek istediğiniz kahvenin numarasını giriniz: ");
        
        Integer selection = scanner.nextInt();
        System.out.println("Teşekkürler kahveniz hazırlanıyor.");
        
        return coffes[selection-1];
    }

    // Verilen kahve tipini construct edip içeriklerini ekrana basar
    @Override
    public void prepareCoffe(CoffeType coffeType) {
        
        Coffe coffe;
        
        // Maks 10 doz oldugu varsayildi
        String[] numbers = {"bir", "iki", "üç", "dört", "beş","altı","yedi", "sekiz", "dokuz", "on"};
        
        try {
            // coffeType ile Coffe initialize eder
            coffe = new Coffe(coffeType);
            
            // Seçilen kahve adını bas.
            System.out.print( coffe + " seçtiniz. ");

            // İçerikleri ekrana bas.
            System.out.println(coffe.getMaterialString() + ". Afiyet Olsun.");
        
        } catch (Exception e) {
            // Kahve tipi hatalı ise uyarı mesaji bas
            System.out.println(e);
        }

        

    }

    
}