package pattern.Prototype;

public class Prototype {

    public static void main(String[] agrs) {
        Charector t = new Charector("Astralair", 99, "Mage");
        Charector tClone = t.Clone();

        System.out.println(tClone);

    }
}