package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Shivurr extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shivurr() {
        super("Shivurr",
                Type.ICE,
                new Stats(36,
                        49,
                        40,
                        74,
                        40,
                        82),
                List.of(Ability.SOUNDPROOF,Ability.RATTLED,Ability.INSOMNIA), Ability.INSOMNIA,
                8, 165,
                new Stats(0,0,0,0,0,1), 192,
                0.5,
                50, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("This Pokémon prefers the cold shadows of caves over the tropical sunlight. It seems unable to properly regulate its body temperature, because it is always shivering."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,3),
                        new MoveLearnSetEntry(Move.ASTONISH,7),
                        new MoveLearnSetEntry(Move.ICY_WIND,11),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,15),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,19),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,23),
                        new MoveLearnSetEntry(Move.HAZE,27),
                        new MoveLearnSetEntry(Move.SCREECH,32),
                        new MoveLearnSetEntry(Move.DEFOG,35),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,38),
                        new MoveLearnSetEntry(Move.FROST_BREATH,42),
                        new MoveLearnSetEntry(Move.COLDSNAP,47),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,50),
                        new MoveLearnSetEntry(Move.BLIZZARD,55),
                        new MoveLearnSetEntry(Move.EARSPLIT,60),
                        new MoveLearnSetEntry(Move.BOOMBURST,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.ICE_SHARD,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tm"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shivurr");

    }


}