package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Lagostr extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lagostr() {
        super("Lagostr",
                Type.WATER,Type.DARK,
                new Stats(80,
                        70,
                        65,
                        105,
                        85,
                        75),
                List.of(Ability.UNNERVE,Ability.WATER_VEIL,Ability.ANTICIPATION), Ability.ANTICIPATION,
                8, 165,
                new Stats(0,0,0,2,0,0), 60,
                0.5,
                168, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.MONSTER),
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
           setLangFileName("Lagostr");

    }


}