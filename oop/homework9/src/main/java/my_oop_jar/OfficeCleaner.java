package my_oop_jar;

public class OfficeCleaner extends Employee {
    public String id;
    public String type;

    public OfficeCleaner(String id, String firstnameInput, String lastnameInput, int salaryInput, String type) {
        super(firstnameInput, lastnameInput, salaryInput);
        this.id = id;
        this.type = type;
    }

    public void Clean() {

    }

    public void KillCoachroach() {

    }

    public void DecorateRoom() {

    }

    public void WelcomeGuest() {

    }

    public void work() {
        Clean();
        KillCoachroach();
        DecorateRoom();
        WelcomeGuest();
    }

}
