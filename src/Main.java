import Hotell.Room;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(1, 1_000, "Standard","None");
        Room[] rooms = {
                room1,
                new Room(2, 1_000, "Standard", "None"),
                new Room(3, 1_000, "Standard", "None"),
        }; // add creator rooms.
        for (Room room : rooms) {
            System.out.println(room.toString());
        }

        System.out.println("Lol");
        System.out.println("It while works!");
    }
}