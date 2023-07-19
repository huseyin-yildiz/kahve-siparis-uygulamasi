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

    public int get_price(){
        return this.price;
    }
}
