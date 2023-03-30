package pawtropolis.game.model.implementation;

public class Item {

    //Attributes
    private String name;
    private String description;
    private int requiredSlots;

    //Constructor
    public Item(String name, String description, int slotRequired) {

        this.name = name;
        this.description = description;
        this.requiredSlots = slotRequired;

    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRequiredSlots() {
        return requiredSlots;
    }

    public void setRequiredSlots(int requiredSlots) {
        this.requiredSlots = requiredSlots;
    }

}
