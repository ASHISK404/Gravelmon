package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Armust extends drai.dev.gravelmon.pokemon.Pokemon {
    public Armust() {
        super("Armust",
                Type.ROCK,Type.DARK,
                new Stats(65,
                        85,
                        95,
                        40,
                        70,
                        50),
                List.of(Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                8, 165,
                new Stats(0,0,1,0,0,0), 45,
                0.5,
                76, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("It lives in hard-to-reach underwater caves, making it a very rare Pokémon. It molts multiple times during a year, trying to get the perfect armor."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ASSURANCE,12),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,20),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,25),
                        new MoveLearnSetEntry(Move.TAUNT,31),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,36),
                        new MoveLearnSetEntry(Move.IRON_HEAD,42),
                        new MoveLearnSetEntry(Move.PROTECT,48),
                        new MoveLearnSetEntry(Move.THRASH,54),
                        new MoveLearnSetEntry(Move.STONE_EDGE,60)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Armust");

    }


}
