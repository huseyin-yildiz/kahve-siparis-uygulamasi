import java.util.Arrays;

public class Mocha extends Coffe  {
    

    public Mocha() {
        
        this.price = 32;
        this.name = new String("Mocha");

        this.materials = Arrays.asList( 
            
            new MaterialPiecePair(Material.Material_ESPRESSO, 1),
            new MaterialPiecePair(Material.Material_STREAMED_MILK, 1),
            new MaterialPiecePair(Material.Material_MILK_FOAM, 1),
            new MaterialPiecePair(Material.Material_HOT_CHOCOLATE, 2)
            
        );

    }
    

    
}
