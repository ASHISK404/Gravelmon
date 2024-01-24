package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Juvy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Juvy() {
        super("Juvy",
                Type.FLYING,Type.DARK,
                new Stats(35,
                        60,
                        30,
                        30,
                        35,
                        50),
                List.of(Ability.BIG_PECKS), Ability.HUSTLE,
                8, 165,
                new Stats(0,1,0,0,0,0), 240,
                0.5,
                50, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Juvy swoop down from the sky to quickly snatch any valuable that a trainer may be holding. They often work with Thefcoon to pull off larger heists."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.THIEF,5),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,10),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,14),
                        new MoveLearnSetEntry(Move.WING_ATTACK,19),
                        new MoveLearnSetEntry(Move.ASSURANCE,24),
                        new MoveLearnSetEntry(Move.ROOST,30),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,34),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,38),
                        new MoveLearnSetEntry(Move.FEATHERRUSH,43),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm")                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Juvy");

    }


}
