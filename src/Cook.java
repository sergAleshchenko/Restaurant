import java.util.Observable;
import java.util.Observer;

/**
 * Created by sergey on 30.10.15.
 */
public class Cook extends Observable implements Observer {
    private String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void update(Observable o, Object arg) {

        ConsoleHelper.writeMessage(String.format("Start cooking - %s, cooking time %dmin",
                arg.toString(),
                ((Order) arg).getTotalCookingTime()));
        setChanged();
        notifyObservers(arg);
    }
}
