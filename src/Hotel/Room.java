package Hotel;
//new line make class hotel

import java.util.Arrays;

public  class Room {
    private static int _countRoom;
    private final int _IDRoom;
    private int _priceRoom;
    private final String _categoryRoom;
    private String _ownerRoom;

    private final static String INFO_ABOUT_CATEGORY_ROOM_STANDARD = "\nStandard - просторный коридор, кухня-гостиная, спальна с двумя кроватями, санузел и отдельная комната с ванной";
    private final static String INFO_ABOUT_CATEGORY_ROOM_DELUXE = "\nDeluxe - кухня-гостиная, спальна с шикарной двухместной кроватью, санузел, ванна в виде бассейна и БОЛЬШИЕ ОКНА с видом на поляну с животными\n";
    public final static String[] INFO_ABOUT_CATEGORY_ROOMS = new String[2];

    static {
        INFO_ABOUT_CATEGORY_ROOMS[0] = INFO_ABOUT_CATEGORY_ROOM_STANDARD;
        INFO_ABOUT_CATEGORY_ROOMS[1] = INFO_ABOUT_CATEGORY_ROOM_DELUXE;
    }


    {
       _countRoom += 1;
    }

    public Room(int _IDRoom, int _priceRoom, String _categoryRoom, String _ownerRoom) {
        this._IDRoom = _IDRoom;
        this._priceRoom = _priceRoom;
        this._categoryRoom = _categoryRoom;
        this._ownerRoom = _ownerRoom;
    }

    public Room(int _IDRoom, int _priceRoom, String _categoryRoom) {
        this._IDRoom = _IDRoom;
        this._priceRoom = _priceRoom;
        this._categoryRoom = _categoryRoom;
        this._ownerRoom = "Nope";
    }

    public void set_priceRoom(int _priceRoom) {
        this._priceRoom = _priceRoom;
    }

    public void set_ownerRoom(String _ownerRoom) {
        this._ownerRoom = _ownerRoom;
    }

    public int get_IDRoom() {
        return _IDRoom;
    }

    public int get_priceRoom() {
        return _priceRoom;
    }

    public String get_categoryRoom() {
        return _categoryRoom;
    }

    public String get_ownerRoom() {
        return _ownerRoom + "\n";
    }

    public String get_countRoom(){
        return "Количество всех комнат: "+ _countRoom ;
    }

    @Override
    public String toString() {
        return "Информация о Room: " +
                "ID комнаты = " + _IDRoom +
                ", Цена = " + _priceRoom +
                ", Категория = " + _categoryRoom +
                ", Владелец комнаты = " + _ownerRoom +
                '.';
    }

    public void containsRoom(String ...furniture){
        System.out.printf("Мебель в комнате %d: %s\n", get_IDRoom(), Arrays.toString(furniture));
    }

}
