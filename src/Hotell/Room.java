package Hotell;
//new line make class hotel

public class Room {
    private static int _countRoom;
    private final int _IDRoom;
    private int _priceRoom;
    private final String _categoryRoom;
    private String _ownerRoom;

    static {
        _countRoom += 1;
    }

    public Room(int _IDRoom, int _priceRoom, String _categoryRoom, String _ownerRoom) {
        this._IDRoom = _IDRoom;
        this._priceRoom = _priceRoom;
        this._categoryRoom = _categoryRoom;
        this._ownerRoom = _ownerRoom;
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
        return _ownerRoom;
    }

    @Override
    public String toString() {
        return "Room:" +
                "_IDRoom=" + _IDRoom +
                ", _priceRoom=" + _priceRoom +
                ", _categoryRoom='" + _categoryRoom + '\'' +
                ", _ownerRoom='" + _ownerRoom + '\'' +
                '.';
    }

}
