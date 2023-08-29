package org.example;

/*
 * Farklı kahve içerik tiplerini türkçe adlarıyla beraber barındırır.
 */
public enum Material {
    Material_ESPRESSO("espresso"),
    Material_DOPPIO("doppio"),
    Material_HOT_WATER("sıcak su"),
    Material_MILK_FOAM("süt köpüğü"),
    Material_STREAMED_MILK("buharlı süt"),
    Material_HOT_CHOCOLATE("sıcak çikolata");

    private String name;

    private Material(String name) {
        this.name = name;    
    }

    public String toString(){
        return name;
    }
}