package Hotel;

import java.util.Objects;

public class Room {
    private String name;
    private String floor;
    private RoomType type;

    public Room(String name, String floor, RoomType type) {
        this.name = name;
        this.floor = floor;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(name, room.name) && Objects.equals(floor, room.floor) && type == room.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, floor, type);
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", floor='" + floor + '\'' +
                ", type=" + type +
                '}';
    }
}
