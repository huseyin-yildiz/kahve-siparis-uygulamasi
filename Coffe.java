import java.util.ArrayList;
import java.util.List;

/**
 * Kahve class'ı - CoffeType alarak initialize olur ve gerekli malzemeleri listeye ekler. 
 * Bilinmeyen tipte gelirse exception atar.
 */
public class Coffe {

    // Malzeme tipi ve sayısı tutmak için class
    public class MaterialPiecePair{
        private Material material;
        private int size;

        public MaterialPiecePair(Material material, int size) {
            this.material = material;
            this.size = size;
        }

        public Material getMaterial(){
            return material;
        }

        public int getSize(){
            return size;
        }

    }

    // <Malzeme,adet> çifti listesi
    private List<MaterialPiecePair> materials;
    
    // Kahve tipi
    private CoffeType coffeType;
    

    // Coffe constructor - Gelen kahve tipine göre gerekli malzemeleri ekler
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

    // Kahveye verilen içeriği ekler
    private void addMaterial(Material material, int size){
        materials.add(new MaterialPiecePair(material, size));
    }

    // Malzeme listesi döndürür.
    public List<MaterialPiecePair> getMaterials(){
        return materials;
    }

    // CoffeType enum döndürür
    public CoffeType getCoffeType(){
        return coffeType;
    }

    // Ücret
    public int get_coffe_price(){
        return coffeType.getPrice();
    }

    // Kahve adını döndürür
    public String toString(){
        return coffeType.toString();
    }

    // Malzeme içerik stringi döndürür
    public String getMaterialString(){
            String text = "Bu içeceğimiz";

            for (Coffe.MaterialPiecePair materialPiece : materials) 
                text += " " + materialPiece.getSize() + " doz " + materialPiece.getMaterial();
            
            text += " içermektedir";
            return text;
    }
}