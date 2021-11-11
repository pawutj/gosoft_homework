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

    }

    public void holiday() {

    }

    public void gossip() {

    }

    public void developWebsite() {

    }

    public void computerFix() {

    }

    public void windowInstall() {
    }

}
