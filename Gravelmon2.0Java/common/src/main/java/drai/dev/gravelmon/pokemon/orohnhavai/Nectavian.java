package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Nectavian extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nectavian() {
        super("Nectavian",
                Type.GRASS,Type.FLYING,
                new Stats(60,
                        85,
                        65,
                        45,
                        45,
                        105),
                List.of(Ability.CHLOROPHYLL,Ability.SAP_SIPPER,Ability.EARLY_BIRD), Ability.EARLY_BIRD,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("A rare Pokemon from far away that was found in the Havai region feeding on the nectar of flowers. They hover in mid-air at rapid wing flapping rates, typically around 150 times per second, allowing them also to fly at incredibly high speeds, backwards or upside down."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nectavian");

    }


}
