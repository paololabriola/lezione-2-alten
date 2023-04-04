package pawtropolis.map.domain;

public enum Direction {

    NORTH("north"),
    SOUTH("south"),
    EAST("east"),
    WEST("west");

    //Attributes
    private final String name;

    private Direction(String name) {
        this.name = name;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    //Other methods
    public Direction getOppositeDirection() {

        return switch (this) {
            case NORTH -> SOUTH;
            case SOUTH -> NORTH;
            case EAST -> WEST;
            case WEST -> EAST;
            default -> throw new IllegalStateException("The following direction doesn't exist: " + this);
        };

    }

}
