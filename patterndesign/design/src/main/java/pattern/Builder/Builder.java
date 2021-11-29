package pattern.Builder;

public class Builder {
    public static void main(String[] agrs) {
        Weapon weapon = new Weapon("DULL SWORD", 20, Type.SWORD, Rank.Strong, Element.FIRE, "", "", 0);

        Weapon weapon_withBuilder = Weapon.builder().setName("DULL SWORD")
                .setBaseAtk(20)
                .setType(Type.SWORD)
                .setRank(Rank.Strong)
                .setElement(Element.FIRE);
        System.out.println(weapon.toString());
        System.out.println(weapon_withBuilder.toString());
    }
}
