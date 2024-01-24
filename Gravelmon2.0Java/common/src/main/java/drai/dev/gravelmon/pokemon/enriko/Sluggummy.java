package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Sluggummy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sluggummy() {
        super("Sluggummy",
                Type.FAIRY,
                new Stats(95,
                        35,
                        60,
                        35,
                        40,
                        20),
                List.of(Ability.GOOEY), Ability.AROMA_VEIL,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It leaves a trail of sticky slime behind itself as it moves. The trail is sweet, leading predators to go after the slime instead of itself."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,5),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,15),
                        new MoveLearnSetEntry(Move.POISON_POWDER,21),
                        new MoveLearnSetEntry(Move.SWEET_KISS,28),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,35),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,40),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,50),
                        new MoveLearnSetEntry(Move.AMNESIA,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sluggummy");

    }


}
