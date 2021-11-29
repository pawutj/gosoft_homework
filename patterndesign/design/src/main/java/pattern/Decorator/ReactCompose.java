package pattern.Decorator;

public abstract class ReactCompose implements ReactComponent {
    private ReactComponent reactComponent;

    public ReactCompose(ReactComponent reactComponent) {
        this.reactComponent = reactComponent;

    }

    public ReactComponent getReactComponent() {
        return reactComponent;
    }

    public int getWraperCount() {
        return reactComponent.getWraperCount() + 1;
    }
}
