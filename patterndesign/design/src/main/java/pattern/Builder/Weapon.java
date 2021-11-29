package pattern.Builder;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Weapon {
    private String name = "";
    private int baseAtk = 0;
    private Type type = Type.SWORD;
    private Rank rank = Rank.Strong;
    private Element element = Element.FIRE;
    private String option1 = "";
    private String option2 = "";
    private int slot = 0;

    public static Weapon builder() {
        return new Weapon();
    }

    public Weapon setName(String name) {
        this.name = name;
        return this;
    }

    public Weapon setBaseAtk(int baseAtk) {
        this.baseAtk = baseAtk;
        return this;
    }

    public Weapon setType(Type type) {
        this.type = type;
        return this;
    }

    public Weapon setRank(Rank rank) {
        this.rank = rank;
        return this;
    }

    public Weapon setElement(Element element) {
        this.element = element;
        return this;
    }

    public Weapon setOption1(String option1) {
        this.option1 = option1;
        return this;
    }

    public Weapon setOption2(String option2) {
        this.option2 = option2;
        return this;

    }

    public Weapon setSlot(int slot) {
        this.slot = slot;
        return this;
    }
}
