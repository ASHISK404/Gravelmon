package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Eruptle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Eruptle() {
        super("Eruptle",
                Type.BUG, Type.FIRE,
                new Stats(85,
                        65,
                        75,
                        90,
                        55,
                        40),
                List.of(Ability.SWARM), Ability.FLAME_BODY,
                0, 0,
                new Stats(0,0,3,0,0,0), 45,
                0.5,
                185, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Eruptle lifts its front arms over its head to create a menacing appearance due to its tiny stature. The secreted oil collected in its claws ignites the flame from its proboscis."),
                List.of(),
                List.of(                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Eruptle");

    }


}