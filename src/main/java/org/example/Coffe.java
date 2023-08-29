package org.example;
import java.util.List;

public abstract class Coffe {

    
    protected List<MaterialPiecePair> materials;
    protected float price;
    protected String name;
    

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


    // Malzeme listesi döndürür.
    public List<MaterialPiecePair> getMaterials(){
        return materials;
    }

    // CoffeType enum döndürür
    public String getName(){
        return name;
    }

    // Ücret
    public float getPrice(){
        return price;
    }

    // Malzeme içerik stringi döndürür
    public String toString(){

        String text = "Bu içeceğimiz";

        for (Coffe.MaterialPiecePair materialPiece : materials) 
            text += " " + materialPiece.getSize() + " doz " + materialPiece.getMaterial();
        
        text += " içermektedir. Afiyet Olsun.";
        return text;
    }

}