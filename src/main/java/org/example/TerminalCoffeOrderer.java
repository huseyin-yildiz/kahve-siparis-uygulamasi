package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * TerminalCoffeOrderer
 * Terminalden kahve siparişi almak için implement edildi 
 */
public class TerminalCoffeOrderer implements ICoffeOrderer{

    private List<Coffe> coffes;

    public TerminalCoffeOrderer() {
        
        coffes = new ArrayList<Coffe>();

        coffes.add(new Espresso());
        coffes.add(new DoubleEspresso());
        coffes.add(new Cappucino());
        coffes.add(new CaffeLatte());
        coffes.add(new Mocha());
        coffes.add(new Americano());
        coffes.add(new HotWater());
        
    }

    // Tüm kahve tiplerini ücretleriyle basar
    @Override
    public void presentCoffeMenu() {
        
        Integer i=0;
                
        for (Coffe coffe : coffes) 
        {
            String item = String.format("%d.%s (%.2f ₺)", ++i, coffe.getName(), coffe.getPrice());
            System.out.println(item);
        }

    }

    // İstenilen kahve tipini kullanıcıdan alır ve CoffeType olarak döndürür.
    @Override
    public int takeOrder() {
        Scanner scanner = new Scanner(System.in);
        Integer selection;
        
        // Dogru secim alinana kadar sorar.
        while(true) {
            System.out.print("Lütfen içmek istediğiniz kahvenin numarasını giriniz: ");
            
            selection = scanner.nextInt();
            
            if(selection > coffes.size() || selection < 1)
                System.out.println("Hata : Yanlis secim");
            else
                break;
        }
        
        System.out.println("Teşekkürler kahveniz hazırlanıyor.");
            
        return selection;
            
    }

    // Verilen kahve tipini construct edip içeriklerini ekrana basar
    @Override
    public void prepareCoffe(int selection) {
        
        Coffe coffe;

        coffe = coffes[selection];

        // Seçilen kahve adını bas.
        System.out.print( coffe.getName() + " seçtiniz. ");

        // İçerikleri ekrana bas.
        System.out.println(coffe);
        


        

    }

    
}