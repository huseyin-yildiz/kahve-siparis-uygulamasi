import java.util.Arrays;

public class Americano extends Coffe  {
    

    public Americano() {
        
        this.price = 26;
        this.name = new String("Americano");

        this.materials = Arrays.asList( 
            
            new MaterialPiecePair(Material.Material_ESPRESSO, 1),
            new MaterialPiecePair(Material.Material_HOT_WATER, 4) 
            
        );

    }
    

    
}
