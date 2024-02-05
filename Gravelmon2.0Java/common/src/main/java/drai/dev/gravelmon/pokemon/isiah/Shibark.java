package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Shibark extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shibark() {
        super("Shibark",
                Type.GRASS,
                new Stats(89,
                        94,
                        62,
                        50,
                        52,
                        58),
                List.of(Ability.OVERGROW), Ability.OVERGROW,
                8, 165,
                new Stats(1,1,0,0,0,0), 45,
                0.5,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shibark");

    }


}