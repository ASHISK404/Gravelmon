package drai.dev.gravelmon.pokemon.olysos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Piedow extends drai.dev.gravelmon.pokemon.Pokemon {
    public Piedow() {
        super("Piedow",
                Type.ICE, Type.NORMAL,
                new Stats(60,
                        65,
                        50,
                        45,
                        50,
                        70),
                List.of(Ability.CUTE_CHARM,Ability.SNOW_CLOAK), Ability.SERENE_GRACE,
                6, 145,
                new Stats(0,1,0,0,0,1), 120,
                0.5,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The coat of Piedoe is very soft, dense and usually colored in a light brown tone. It often headbutts trees to strengthen it's head."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Piedow");

    }


}