import java.util.Arrays;

public class CaffeLatte extends Coffe  {
    

    public CaffeLatte() {
        
        this.price = 28;
        this.name = new String("CaffeLatte");

        this.materials = Arrays.asList( 
            
            new MaterialPiecePair(Material.Material_ESPRESSO, 1),
            new MaterialPiecePair(Material.Material_STREAMED_MILK, 3),
            new MaterialPiecePair(Material.Material_MILK_FOAM, 1) 
            
        );

    }
    

    
}
