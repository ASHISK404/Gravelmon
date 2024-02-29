package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Territore extends drai.dev.gravelmon.pokemon.Pokemon {
    public Territore() {
        super("Territore",
                Type.NORMAL,Type.FLYING,
                new Stats(66,
                        80,
                        53,
                        48,
                        62,
                        73),
                List.of(Ability.BIG_PECKS,Ability.INTIMIDATE,Ability.RIVALRY), Ability.RIVALRY,
                8, 165,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                117, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("These Pokemon are aggressive and territorial with Arctalon. Despite the fact that Arctalon's Ice-type moves put them at a disadvantage, they are incredibly skilled and shrewd in combat."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,5),
                        new MoveLearnSetEntry(Move.PURSUIT,9),
                        new MoveLearnSetEntry(Move.WING_ATTACK,13),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,18),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,23),
                        new MoveLearnSetEntry(Move.WHIRLWIND,28),
                        new MoveLearnSetEntry(Move.AGILITY,33),
                        new MoveLearnSetEntry(Move.SLASH,38),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,43),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,48),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,53),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.CHIRP,"tm"),
                        new MoveLearnSetEntry(Move.FEATHERRUSH,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Territore");

    }


}