package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Wahundo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wahundo() {
        super("Wahundo",
                Type.DARK,
                new Stats(65,
                        45,
                        10,
                        65,
                        10,
                        60),
                List.of(Ability.PICKUP,Ability.FRISK,Ability.FOREWARN), Ability.FOREWARN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("how clever of me haha // Its diet consists mostly of cotton and paper. It lays flat on its face to imitate a regular dollar so unaware explorers will hopefully take it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BLOCK,5),
                        new MoveLearnSetEntry(Move.DETECT,7),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.TAUNT,12),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,16),
                        new MoveLearnSetEntry(Move.SWIFT,20),
                        new MoveLearnSetEntry(Move.THIEF,24),
                        new MoveLearnSetEntry(Move.SWAGGER,28),
                        new MoveLearnSetEntry(Move.CRUNCH,32),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,36),
                        new MoveLearnSetEntry(Move.DARK_PULSE,40)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wahundo");

    }


}
