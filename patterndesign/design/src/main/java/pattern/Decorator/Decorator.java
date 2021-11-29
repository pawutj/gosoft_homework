package pattern.Decorator;

public class Decorator {

    public static void main(String[] agrs) {
        ReactComponent reactComponent = new BaseComponent();
        reactComponent = new StateCompose(reactComponent);
        reactComponent = new StateCompose(reactComponent);
        reactComponent = new CortexCompose(reactComponent);
        System.out.println(reactComponent.getStatus());
        System.out.println(reactComponent.getWraperCount());
    }

}
