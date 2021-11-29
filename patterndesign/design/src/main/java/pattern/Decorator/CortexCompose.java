package pattern.Decorator;

public class CortexCompose extends ReactCompose {

    public CortexCompose(ReactComponent reactComponent) {
        super(reactComponent);
    }

    @Override
    public String getStatus() {

        // TODO Auto-generated method stub
        return super.getReactComponent().getStatus() + "with Cortex ";
    }
}
