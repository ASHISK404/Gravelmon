package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Baristroll extends drai.dev.gravelmon.pokemon.Pokemon {
    public Baristroll() {
        super("Baristroll",
                Type.DARK, Type.FAIRY,
                new Stats(85,
                        85,
                        85,
                        85,
                        85,
                        85),
                List.of(Ability.VITAL_SPIRIT), Ability.VITAL_SPIRIT,
                14, 530,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                174, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("An over indulgence for coffee beans causes Caffiend to evolve. They commonly work alongside humans in cafés where they are rewarded with fresh coffee beans."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ENERGY_BALL,1),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,1),
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.THIEF,1),
                        new MoveLearnSetEntry(Move.CRAFTY_SHIELD,1),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,1),
                        new MoveLearnSetEntry(Move.SWITCHEROO,1),
                        new MoveLearnSetEntry(Move.SCALD,1),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,1),
                        new MoveLearnSetEntry(Move.SNATCH,1),
                        new MoveLearnSetEntry(Move.LEECH_SEED,1),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,1),
                        new MoveLearnSetEntry(Move.FLING,1),
                        new MoveLearnSetEntry(Move.EMBARGO,1),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,1),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Baristroll");

    }


}