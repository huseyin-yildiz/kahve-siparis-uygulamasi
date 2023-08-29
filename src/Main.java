public class Main {
    public static void main(String[] args) 
    {
        // Kahve Siparişcisi 
        ICoffeOrderer coffeOrderer = new TerminalCoffeOrderer();
        
        // Kahve listesini sunar
        coffeOrderer.presentCoffeMenu();
        
        // Sipariş alir
        int order = coffeOrderer.takeOrder();
        
        // Siparis edilen kahveyi hazirlar.
        coffeOrderer.prepareCoffe(order);
    }

}
