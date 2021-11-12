import java.util.ArrayList;

public class State {
    public static State getInstance() {
        if (instance == null)
            instance = new State();
        return instance;

    }

    public boolean isAdmin = false;
    public ArrayList<Product> shoppingCart = new ArrayList<>();
}
