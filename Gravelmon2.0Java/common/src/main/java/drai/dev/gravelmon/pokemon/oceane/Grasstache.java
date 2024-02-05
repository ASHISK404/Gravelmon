package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Grasstache extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grasstache() {
        super("Grasstache",
                Type.GRASS,
                new Stats(101,
                        34,
                        43,
                        64,
                        77,
                        20),
                List.of(Ability.ANTICIPATION), Ability.DAZZLING,
                8, 165,
                new Stats(1,0,0,0,0,0), 0,
                1.0,
                68, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grasstache");

    }


}