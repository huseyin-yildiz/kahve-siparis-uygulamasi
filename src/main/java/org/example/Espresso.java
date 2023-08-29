package org.example;
import java.util.Arrays;

public class Espresso extends Coffe {
    

    public Espresso() {
        
        this.price = 20;
        this.name = new String("Espresso");

        this.materials = Arrays.asList( 
            
            new MaterialPiecePair(Material.Material_ESPRESSO, 1) 
            
        );

    }
    

    
}
