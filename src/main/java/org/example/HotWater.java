package org.example;
import java.util.Arrays;

public class HotWater extends Coffe  {
    

    public HotWater() {
        
        this.price = 5;
        this.name = new String("Hot Water");

        this.materials = Arrays.asList( 
            
            new MaterialPiecePair(Material.Material_HOT_WATER, 5)
            
        );

    }
    

    
}
