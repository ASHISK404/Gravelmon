package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Gleamur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gleamur() {
        super("Gleamur",
                Type.ELECTRIC,
                new Stats(75,
                        60,
                        60,
                        100,
                        85,
                        110),
                List.of(Ability.STATIC,Ability.CHEEK_POUCH,Ability.MOTOR_DRIVE), Ability.MOTOR_DRIVE,
                8, 165,
                new Stats(0,0,0,0,0,2), 60,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("After dark is when they are most active. Due to the energy stored in their body, which causes their fur to shine, they can be seen high-jumping while appearing to be shooting stars at a distance."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERTAIL,"tm"),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,"tm")                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gleamur");

    }


}
