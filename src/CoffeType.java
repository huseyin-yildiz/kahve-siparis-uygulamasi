/*
 * Kahve Tipleri ve fiyatlarını barındırır.
 */

public enum CoffeType {
    COFFE_ESPRESSO(20),
    COFFE_DOUBLE_ESPRESSO(27),
    COFFE_CAPPUCINO(28),
    COFFE_CAFFE_LATTE(28),
    COFFE_MOCHA(32),
    COFFE_AMERICANO(26),
    COFFE_HOT_WATER(5);

    private int price;


    private CoffeType(int price) {
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    // Enum adini liste adina cevirir
    public String toString(){
        String name = this.name().substring(6).replace("_"," ");
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();  
        return name;
    }
}
