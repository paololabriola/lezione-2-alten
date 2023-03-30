package pawtropolis.game.model.implementation;

public class Item {

    //Attributes
    private String name;
    private String description;
    private int slotRequired;

    //Constructor
    public Item(String name, String description, int slotRequired) {

        this.name = name;
        this.description = description;
        this.slotRequired = slotRequired;

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

    public int getSlotRequired() {
        return slotRequired;
    }

    public void setSlotRequired(int slotRequired) {
        this.slotRequired = slotRequired;
    }

}
