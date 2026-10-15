import Hotell.Room;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(1, 1_000, "Standard","None");
        Room[] rooms = {
                room1,
                new Room(2, 1_000, "Standard", "None"),
                new Room(3, 1_000, "Standard", "None"),
        };

        for (Room room : rooms) {
            System.out.println(room.toString());
        }

        rooms[0].set_ownerRoom("Nova");
        rooms[1].set_ownerRoom("Gans");
        rooms[1].containsRoom("кровать", "диван");
        System.out.printf("Владелец комнаты %d, %s", rooms[0].get_countRoom(), rooms[0].get_ownerRoom());

        System.out.println("It while works!");
    }
}