import Hotel.Room;
import People.Citizen;
import People.Human;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Room.INFO_ABOUT_CATEGORY_ROOMS));

        Room room1 = new Room(1, 1_000, "Standard","None");
        Room[] rooms = {
                room1,
                new Room(2, 1_000, "Standard", "None"),
                new Room(3, 1_000, "Standard", "None"),
                new Room(4, 1_000, "Standard")
        };


        for (Room room : rooms) {
            System.out.println(room.toString());
        }

        rooms[0].set_ownerRoom("Nova");
        rooms[1].set_ownerRoom("Gans");
        rooms[1].containsRoom("кровать", "диван");
        System.out.printf("Владелец комнаты %d, %s", rooms[0].get_IDRoom(), rooms[0].get_ownerRoom());

        Citizen citizen = new Citizen("Garry");
        citizen.showPassport();
        citizen.whereLive();
        citizen.Alive();


        System.out.println("It while works!");
    }
}