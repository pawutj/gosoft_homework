package pattern.Prototype;

public class Charector implements ICloneable {
    private String name;
    private int level;
    private String job;

    public Charector(String name, int level, String job) {
        this.name = name;
        this.level = level;
        this.job = job;
    }

    public Charector() {
    }

    // #####Implement IClone #######

    public Charector Clone() {
        Charector c = new Charector();
        c.name = this.name;
        c.level = this.level;
        c.job = this.job;
        return c;
    }
}
