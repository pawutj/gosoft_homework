package my_oop_jar;

public class Programmer extends Employee {
    public String id;
    public String type;

    public Programmer(String name, String surname, int salary) {
        super(name, surname, salary);

    }

    public Programmer(String id, String name, String surname, int salary, String type) {
        super(name, surname, salary);
        this.id = id;
        this.type = type;
    }

    public void work() {
        holiday();
        gossip();
        developWebsite();
        computerFix();
        windowInstall();
    }

    public void holiday() {
        System.out.println("holiday");

    }

    public void gossip() {
        System.out.println("gossip");
    }

    public void developWebsite() {
        System.out.println("developWebsite");
    }

    public void computerFix() {
        System.out.println("computerFix");
    }

    public void windowInstall() {
        System.out.println("windowInstall");
    }

}
