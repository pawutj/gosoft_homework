package pattern.Decorator;

public class StateCompose extends ReactCompose {

    public StateCompose(ReactComponent reactComponent) {
        super(reactComponent);
    }

    @Override
    public String getStatus() {

        // TODO Auto-generated method stub
        return this.getReactComponent().getStatus() + "with State ";
    }
}
