package People;

public abstract class Human extends Passport{
    private String _nameHuman;
    private int _age;

    public abstract void whereLive();

    public Human(String _nameHuman, int _age) {
        this._nameHuman = _nameHuman;
        this._age = _age;
    }

    public String get_nameHuman() {
        return _nameHuman;
    }

    public void Alive(){
        System.out.println("В норме");
    }

    @Override
    public void showPassport(){
        System.out.printf("%s показал паспорт, возраст %d\n", _nameHuman, _age);
    }

}
