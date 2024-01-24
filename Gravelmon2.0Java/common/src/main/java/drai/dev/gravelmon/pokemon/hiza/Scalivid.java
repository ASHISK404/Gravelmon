package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Scalivid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scalivid() {
        super("Scalivid",
                Type.GRASS,
                new Stats(55,
                        50,
                        60,
                        65,
                        50,
                        75),
                List.of(Ability.MULTISCALE), Ability.MULTISCALE,
                8, 165,
                new Stats(0,0,0,1,0,0), 90,
                0.5,
                140, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("It uses its long tail as whip. It is quicker and more confortable when moving through the dense treetops than on the land"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.BULLET_SEED,12),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,22),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,25),
                        new MoveLearnSetEntry(Move.NATURE_POWER,27),
                        new MoveLearnSetEntry(Move.ENDEAVOR,33),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,37),
                        new MoveLearnSetEntry(Move.LEAF_STORM,42),
                        new MoveLearnSetEntry(Move.POWER_WHIP,49)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Scalivid");

    }


}
