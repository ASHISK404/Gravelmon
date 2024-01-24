package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Lobbercut extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lobbercut() {
        super("Lobbercut",
                Type.FIGHTING,
                new Stats(100,
                        115,
                        105,
                        60,
                        85,
                        80),
                List.of(Ability.ANTICIPATION,Ability.FOREWARN,Ability.IRON_FIST), Ability.IRON_FIST,
                8, 165,
                new Stats(0,2,0,0,0,0), 50,
                0.8,
                180, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.BUG),
                List.of("What Lobbercut lacks in brains or brawn, it makes up for in confidence. It will continue to fight onwards no matter how hard the odds are stacked against it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,5),
                        new MoveLearnSetEntry(Move.AQUA_JET,11),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,16),
                        new MoveLearnSetEntry(Move.TWINEEDLE,21),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,26),
                        new MoveLearnSetEntry(Move.MEDITATE,34),
                        new MoveLearnSetEntry(Move.LIQUIDATION,40),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,45),
                        new MoveLearnSetEntry(Move.FEINT,54),
                        new MoveLearnSetEntry(Move.PURSUIT,63),
                        new MoveLearnSetEntry(Move.AGILITY,72),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,90)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lobbercut");

    }


}
