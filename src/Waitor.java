import java.util.Observable;
import java.util.Observer;

/**
 * Created by sergey on 01.11.15.
 */
public class Waitor implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        ConsoleHelper.writeMessage(String.format("%s was cooked by %s", arg, o));
    }
}
