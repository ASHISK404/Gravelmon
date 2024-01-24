package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Awesurge extends drai.dev.gravelmon.pokemon.Pokemon {
    public Awesurge() {
        super("Awesurge",
                Type.ELECTRIC,Type.DRAGON,
                new Stats(95,
                        85,
                        85,
                        110,
                        90,
                        95),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("These speedy yet large Pokemon never set foot on the ground. They are seen competing with other’s of it’s kind, appearing as light trails, as they race and battle for dominance."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.CHARGE,10),
                        new MoveLearnSetEntry(Move.SPARK,15),
                        new MoveLearnSetEntry(Move.AIR_SLASH,20),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,25),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,30),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,35),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,40),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,45),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.TWISTER,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Awesurge");

    }


}
