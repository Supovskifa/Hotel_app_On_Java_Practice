package People;

public abstract class Passport {
    private String name;

    public void infoPassport(){
        System.out.println("Пасспорт, он подтверждает вашу личность в этой стране!");
    }

    public abstract void showPassport();
}
