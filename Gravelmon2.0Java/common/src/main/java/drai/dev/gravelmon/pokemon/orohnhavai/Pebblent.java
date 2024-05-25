package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Pebblent extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pebblent() {
        super("Pebblent",
                Type.ROCK, Type.GRASS,
                new Stats(80,
                        50,
                        68,
                        50,
                        50,
                        15),
                List.of(Ability.LEAF_GUARD,Ability.ROCK_HEAD,Ability.WATER_ABSORB), Ability.WATER_ABSORB,
                6, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Many gardeners and plant lovers love to have Pebblent in their gardens and homes. They make great plant buddies as they like to tend other plants."),
                List.of(new EvolutionEntry("rocroset", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,6),
                        new MoveLearnSetEntry(Move.ALLERGYPOLLEN,9),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,12),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,16),
                        new MoveLearnSetEntry(Move.SYNTHESIS,19),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,22),
                        new MoveLearnSetEntry(Move.GROWTH,26),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,31),
                        new MoveLearnSetEntry(Move.FLATTER,35),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,38),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,43),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,47),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,51),
                        new MoveLearnSetEntry(Move.SNATCH,55),
                        new MoveLearnSetEntry(Move.POWER_WHIP,60)
                ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 28, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pebblent");

    }


}