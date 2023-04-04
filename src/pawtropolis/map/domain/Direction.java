package pawtropolis.map.domain;

public enum Direction {

    NORTH("north"),
    SOUTH("south"),
    EAST("east"),
    WEST("west");

    private final String name;

    private Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
