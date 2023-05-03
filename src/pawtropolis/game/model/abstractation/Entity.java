package pawtropolis.game.model.abstractation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Entity {
    private String name;
    private int healthPoints;
}
