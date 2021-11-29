package pattern.Decorator;

public class BaseComponent implements ReactComponent {

    @Override
    public String getStatus() {
        return "React Component";
    }

    @Override
    public int getWraperCount() {
        return 1;
    }

}
