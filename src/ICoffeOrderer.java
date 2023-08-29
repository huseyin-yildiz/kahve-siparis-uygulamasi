/**
 * ICoffeOrderer
 * Kahve siparişi almak için interface
 * Farklı arayüz tipleri için (Terminal, Gui vs.) implement edilerek kullanılabilir
 */
public interface ICoffeOrderer {

    // Kahve menüsünü göster
    public void presentCoffeMenu();

    // Sipariş al.
    public int takeOrder();

    // Kahveyi hazırla
    public void prepareCoffe(int selection);

}