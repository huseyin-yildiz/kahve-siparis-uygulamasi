import java.util.ArrayList;
import java.util.List;

/**
 * coffe
 */
public class Coffe {

    private class MaterialPiecePair{
        private Material material;
        private int size;

        public MaterialPiecePair(Material material, int size) {
            this.material = material;
            this.size = size;
        }
    }


    private List<MaterialPiecePair> materials;
    
    public Coffe() {
        materials = new ArrayList<MaterialPiecePair>();
    }

    public void addMaterial(Material material, int size){
        materials.add(new MaterialPiecePair(material, size));
    }

    public List<MaterialPiecePair> getMaterials(){
        return materials;
    }
    
}