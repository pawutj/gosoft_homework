package pattern.Decorator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void TestDecoratorReact() {
        ReactComponent reactComponent = new BaseComponent();
        reactComponent = new StateCompose(reactComponent);
        reactComponent = new StateCompose(reactComponent);
        reactComponent = new CortexCompose(reactComponent);

        assertEquals(reactComponent.getStatus(), "React Component with State with State with Cortex ");
        assertEquals(reactComponent.getWraperCount(), 4);
    }
}
