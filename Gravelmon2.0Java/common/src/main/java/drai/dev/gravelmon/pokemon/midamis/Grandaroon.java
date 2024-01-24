package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Grandaroon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grandaroon() {
        super("Grandaroon",
                Type.GRASS,Type.NORMAL,
                new Stats(105,
                        100,
                        95,
                        80,
                        95,
                        60),
                List.of(Ability.OVERGROW), Ability.SCRAPPY,
                8, 165,
                new Stats(0,3,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("Grandaroon is the final evolution of the grass starter Floracoon. Grandaroon is a great tank in battle. It has less of an aggressive nature than Bufaroon, which allows it to focus on the more important things in life."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,1),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,38),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,46),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,54),
                        new MoveLearnSetEntry(Move.LEAF_STORM,62),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,70),
                        new MoveLearnSetEntry(Move.VINE_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.POISON_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.SPORE,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.INGRAIN,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grandaroon");

    }


}
