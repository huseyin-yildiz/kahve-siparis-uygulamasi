import java.util.ArrayList;
import java.util.List;

/**
 * coffe
 */
public class Coffe {

    private class MaterialPiecePair{
        private Material material;
        private int size;;

        public MaterialPiecePair(Material material, int size) {
            this.material = material;
            this.size = size;
        }
    }


    private List<MaterialPiecePair> materials;
    private CoffeType coffeType;
    
    public Coffe(CoffeType coffeType) throws Exception {
        materials = new ArrayList<MaterialPiecePair>();
        this.coffeType = coffeType;

        switch (coffeType) {
            case COFFE_ESPRESSO:
                addMaterial(Material.Material_ESPRESSO, 1);                
                break;
        
            
            
            case COFFE_DOUBLE_ESPRESSO:
                addMaterial(Material.Material_ESPRESSO, 2);                
                break;


            case COFFE_AMERICANO:
                addMaterial(Material.Material_ESPRESSO, 1);                
                addMaterial(Material.Material_HOT_WATER, 4);
                break;
            

            case COFFE_CAPPUCINO:
                addMaterial(Material.Material_ESPRESSO, 1);
                addMaterial(Material.Material_STREAMED_MILK, 2);
                addMaterial(Material.Material_MILK_FOAM, 2);
                break;

            
            case COFFE_CAFFE_LATTE:
                addMaterial(Material.Material_ESPRESSO, 1);
                addMaterial(Material.Material_STREAMED_MILK, 3);
                addMaterial(Material.Material_MILK_FOAM, 1);
                break;

            case COFFE_MOCHA:
                addMaterial(Material.Material_ESPRESSO, 1);
                addMaterial(Material.Material_STREAMED_MILK, 1);
                addMaterial(Material.Material_MILK_FOAM, 1);
                addMaterial(Material.Material_HOT_CHOCOLATE, 2);
                break;



            case COFFE_HOT_WATER:
                addMaterial(Material.Material_HOT_WATER, 5);
                break;



            default:
                throw new Exception("Yanlis tipte kahve sectiniz.");
                
        }

    }

    private void addMaterial(Material material, int size){
        materials.add(new MaterialPiecePair(material, size));
    }

    public List<MaterialPiecePair> getMaterials(){
        return materials;
    }

    public CoffeType getCoffeType(){
        return coffeType;
    }

    public int get_coffe_price(){
        return coffeType.get_price();
    }
    
}