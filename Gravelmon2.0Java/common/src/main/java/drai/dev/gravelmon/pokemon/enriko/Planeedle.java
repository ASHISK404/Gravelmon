package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Planeedle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Planeedle() {
        super("Planeedle",
                Type.STEEL,
                new Stats(50,
                        45,
                        35,
                        20,
                        40,
                        30),
                List.of(Ability.MOXIE,Ability.NO_GUARD,Ability.DEFIANT), Ability.DEFIANT,
                8, 165,
                new Stats(0,0,0,0,0,0), 200,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("It fishes for prey with its pointed tail, which is also used in battles for territory. The loser must leave the swamp forever."),
                List.of(new EvolutionEntry("dualance", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,5),
                        new MoveLearnSetEntry(Move.MUDSLAP,7),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,10),
                        new MoveLearnSetEntry(Move.METAL_CLAW,13),
                        new MoveLearnSetEntry(Move.HELPING_HAND,16),
                        new MoveLearnSetEntry(Move.CROSS_POISON,20),
                        new MoveLearnSetEntry(Move.IRON_HEAD,23),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,28),
                        new MoveLearnSetEntry(Move.SLASH,32),
                        new MoveLearnSetEntry(Move.IRON_TAIL,35),
                        new MoveLearnSetEntry(Move.AQUA_RING,37),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,45)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 9, 27, 7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Planeedle");

    }


}