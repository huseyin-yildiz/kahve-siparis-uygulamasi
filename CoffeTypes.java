public enum CoffeTypes {
    ESPRESSO(20),
    DOUBLE_ESPRESSO(27),
    CAPPUCINO(28),
    CAFFE_LATTE(28),
    MOCHA(32),
    AMERICANO(26),
    HOT_WATER(5);

    private int price;

    private CoffeTypes(int price) {
        this.price = price;
    }
}
