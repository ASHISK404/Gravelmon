package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tingillar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tingillar() {
        super("Tingillar",
                Type.BUG,
                new Stats(41,
                        21,
                        31,
                        41,
                        31,
                        41),
                List.of(Ability.SWARM), Ability.SHIELD_DUST,
                3, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It can produce two kinds of silk. The dark silk is harmless, however the lighter silk contains powerful tranquilizer agents."),
                List.of(new EvolutionEntry("maskoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"12")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.TACKLE,3),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,8),
                        new MoveLearnSetEntry(Move.ENDURE,15),
                        new MoveLearnSetEntry(Move.HYPNOSIS,22),
                        new MoveLearnSetEntry(Move.INFESTATION,29),
                        new MoveLearnSetEntry(Move.STICKY_WEB,31),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,36),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,43)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 1, 15, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tingillar");

    }


}