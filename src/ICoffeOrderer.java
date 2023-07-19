/**
 * ICoffeOrderer
 * Kahve siparişi almak için interface
 * Farklı arayüz tipleri için (Terminal, Gui vs.) implement edilerek kullanılabilir
 */
public interface ICoffeOrderer {

    // Kahve menüsünü göster
    public void presentCoffeMenu();

    // Sipariş al.
    public CoffeType takeOrder();

    // Kahveyi hazırla
    public void prepareCoffe(CoffeType coffeType);

}