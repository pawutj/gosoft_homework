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
        System.out.println("Clean");

    }

    public void KillCoachroach() {
        System.out.println("Kill Coachroach");

    }

    public void DecorateRoom() {

        System.out.println("DecorateRoom");
    }

    public void WelcomeGuest() {

        System.out.println("WelcomeGuest");
    }

    public void work() {
        Clean();
        KillCoachroach();
        DecorateRoom();
        WelcomeGuest();
    }

}
