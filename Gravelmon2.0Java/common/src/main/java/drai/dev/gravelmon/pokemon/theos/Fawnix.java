package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Fawnix extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fawnix() {
        super("Fawnix",
                Type.GRASS,
                new Stats(45,
                        45,
                        45,
                        65,
                        65,
                        65),
                List.of(Ability.LEAF_GUARD), Ability.WONDER_SKIN,
                8, 40,
                new Stats(0,0,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It's said that Fawnix can create plant-life in the most barren of areas. They're quiet uncommon to come across in the wild so not many trainers have been able to capture them."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fawnix");

    }


}