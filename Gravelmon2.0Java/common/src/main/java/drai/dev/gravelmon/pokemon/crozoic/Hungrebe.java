package drai.dev.gravelmon.pokemon.crozoic;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Hungrebe extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hungrebe(Stats stats) {
        super("Hungrebe",
                Type.FLYING, Type.WATER,
                stats,
                List.of(Ability.GLUTTONY), Ability.SWIFT_SWIM,
                14, 670,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_1),
                List.of("On land, all it can do is slide on its belly. However, it's capable of performing acrobatic movements in its underwater habitat."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,1),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,1),
                        new MoveLearnSetEntry(Move.CYCLONE,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.FLIP_TURN,1),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.ACROBATICS,1),
                        new MoveLearnSetEntry(Move.WISH,1),
                        new MoveLearnSetEntry(Move.DRILL_PECK,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 43, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FREEZING, Biome.IS_LUSH))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);

        setCanFly(true);
           setLangFileName("Hungrebe");

    }


}