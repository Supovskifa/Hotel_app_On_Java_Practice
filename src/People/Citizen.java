package People;

public class Citizen extends Human{
    public Citizen(String nameHuman) {
        super(nameHuman, 28);
    }

    @Override
    public void whereLive() {
        System.out.printf("Гражданин %s живёт в UK.\n", super.get_nameHuman());
    }

    public void Alive(){
        System.out.println("Живет в городе нн");
        super.Alive();
    }
}
