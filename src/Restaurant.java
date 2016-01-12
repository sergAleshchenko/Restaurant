/**
 * Created by sergey on 05.10.15.
 */
public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet = new Tablet(5);
        Cook cook = new Cook("Amigo");
        tablet.addObserver(cook);
        Waitor waitor = new Waitor();
        cook.addObserver(waitor);
        tablet.createOrder();

    }
}
