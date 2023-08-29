package org.example;
import java.util.Arrays;

public class DoubleEspresso extends Coffe  {
    
    
    public DoubleEspresso() {
        
        this.price = 27;
        this.name = new String("Double Espresso");

        this.materials = Arrays.asList( 
            
            new MaterialPiecePair(Material.Material_ESPRESSO, 2) 
            
        );

    }
    


    
}
