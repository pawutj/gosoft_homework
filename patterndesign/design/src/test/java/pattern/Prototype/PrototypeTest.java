package pattern.Prototype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class PrototypeTest {
    @Test
    public void testCloneMethod() {
        Charector t = new Charector("Astralair", 99, "Mage");
        Charector tClone = t.Clone();

        assertEquals(tClone.getName(), "Astralair");
        assertEquals(tClone.getLevel(), 99);
        assertEquals(tClone.getJob(), "Mage");

        assertNotEquals(tClone, t);
        assertEquals(tClone, tClone);
    }
}
