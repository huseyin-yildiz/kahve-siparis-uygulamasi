package org.example;
import java.util.Arrays;

public class Cappucino extends Coffe {
    

    public Cappucino() {
        
        this.price = 28;
        this.name = new String("Cappucino");

        this.materials = Arrays.asList( 
            
            new MaterialPiecePair(Material.Material_ESPRESSO, 1),
            new MaterialPiecePair(Material.Material_STREAMED_MILK, 2),
            new MaterialPiecePair(Material.Material_MILK_FOAM, 2) 
            
        );

    }
    

    
}
