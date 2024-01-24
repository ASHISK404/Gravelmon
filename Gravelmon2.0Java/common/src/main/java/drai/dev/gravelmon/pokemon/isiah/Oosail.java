package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Oosail extends drai.dev.gravelmon.pokemon.Pokemon {
    public Oosail() {
        super("Oosail",
                Type.WATER,
                new Stats(40,
                        40,
                        45,
                        40,
                        30,
                        80),
                List.of(Ability.SWIFT_SWIM,Ability.INFILTRATOR,Ability.UNAWARE), Ability.UNAWARE,
                8, 165,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                55, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
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
           setLangFileName("Oosail");

    }


}
