package pawtropolis.game.model.implementation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private String name;
    private String description;
    private int requiredSlots;

    public Item(String name, String description, int slotRequired) {

        this.name = name;
        this.description = description;
        this.requiredSlots = slotRequired;

    }
}
