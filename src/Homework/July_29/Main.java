package Homework.July_29;

import Homework.July_29.First_HW.HelloWorld;
import Homework.July_29.Second_HW.Room;
import Homework.July_29.Third_HW.Building;

public class Main {

    private static int numberOFRoom;

    public static void main(String[] args) {
        new HelloWorld();

        Room hotel1 = new Room(102, "Hotel", 25, 25, "Baku", "H.Javid");
        Room hotel2 = new Room(103, "Hotel", 25, 25, "Ganja", "H.Aliyev");

        Building baku = new Building("Baku", "S.Vurgun");

        System.out.println(numberOfRooms(hotel1, hotel2));
    }

    //Task 3
    public static int numberOfRooms(Room ... rooms) {
        numberOFRoom = rooms.length;
        return numberOFRoom;
    }
}
