package pattern.Builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import pattern.Builder.Weapon;
import lombok.var;

public class BuilderTest {

    @Test
    public void testBuildWeapon() {
        Weapon weapon = Weapon.builder()
                .setName("astralaria")
                .setBaseAtk(200)
                .setElement(Element.FIRE)
                .setSlot(3)
                .setOption1("1Hit1Kill");
        assertEquals(weapon.getName(), "astralaria");
        assertEquals(weapon.getBaseAtk(), 200);
        assertEquals(weapon.getElement(), Element.FIRE);
        assertEquals(weapon.getSlot(), 3);
        assertEquals(weapon.getOption1(), "1Hit1Kill");
    }
}
