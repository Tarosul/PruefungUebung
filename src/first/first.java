package first;

import objects.room;

public class first {

	public static void main(String[] args) {

		room[] rooms = { new room("room1", 1), new room("room3", 3), new room("room4", 4), new room("room5", 5),new room("room2", 2) };

		for (int i = 0; i < rooms.length; i++) {
			for (int j = i + 1; j < rooms.length; j++) {
				if (rooms[i].getAnzahl() > rooms[j].getAnzahl()) {
					room tempRooms = rooms[i];
					rooms[i] = rooms[j];
					rooms[j] = tempRooms;

				}
			}

		}

		for (int i = 0; i < rooms.length; i++) {
			System.out.print(rooms[i].getAnzahl());
		}
	}

}
