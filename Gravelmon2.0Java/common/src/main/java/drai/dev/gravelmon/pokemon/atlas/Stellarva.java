package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Stellarva extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stellarva() {
        super("Stellarva",
                Type.BUG,Type.PSYCHIC,
                new Stats(35,
                        32,
                        45,
                        48,
                        60,
                        40),
                List.of(Ability.COMPOUND_EYES,Ability.NOCTURNAL,Ability.WONDER_SKIN), Ability.WONDER_SKIN,
                8, 165,
                new Stats(0,0,0,0,1,0), 240,
                0.5,
                52, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Stellarva light up the night like a starry sky. They use their glowing lights to communicate with each other and create beautiful spectacles."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.BUG_BITE,15),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,25),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stellarva");

    }


}
