package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Algrain extends drai.dev.gravelmon.pokemon.Pokemon {
    public Algrain() {
        super("Algrain",
                Type.GRASS,
                new Stats(55,
                        54,
                        46,
                        59,
                        46,
                        55),
                List.of(Ability.WATER_ABSORB,Ability.DAMP,Ability.REGENERATOR), Ability.REGENERATOR,
                8, 165,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Large gardens of Algrain cover the ocean surface. They use their vines to entangle and strangle anyone who gets too close. They can split to replicate themselves, without the need for a mate."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,5),
                        new MoveLearnSetEntry(Move.WRAP,9),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,14),
                        new MoveLearnSetEntry(Move.SYNTHESIS,17),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,21),
                        new MoveLearnSetEntry(Move.TICKLE,25),
                        new MoveLearnSetEntry(Move.AQUA_RING,29),
                        new MoveLearnSetEntry(Move.BRINE,33),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,38),
                        new MoveLearnSetEntry(Move.GROWTH,42),
                        new MoveLearnSetEntry(Move.WRING_OUT,48),
                        new MoveLearnSetEntry(Move.POWER_WHIP,53)                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Algrain");

    }


}
