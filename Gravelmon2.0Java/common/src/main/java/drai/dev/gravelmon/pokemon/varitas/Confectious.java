package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Confectious extends drai.dev.gravelmon.pokemon.Pokemon {
    public Confectious() {
        super("Confectious",
                Type.FAIRY, Type.POISON,
                new Stats(95,
                        55,
                        70,
                        55,
                        70,
                        10),
                List.of(Ability.GLUTTONY,Ability.STICKY_HOLD,Ability.SWEET_VEIL), Ability.SWEET_VEIL,
                8, 165,
                new Stats(1,0,0,0,0,0), 225,
                0.0,
                71, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FAIRY),
                List.of("It is a being of discarded candy that somehow gained sentience and now roams the fairgrounds searching for more sweets to eat. It ensnares opponents in a sticky sugary goo that's nearly impossible to escape by force."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,3),
                        new MoveLearnSetEntry(Move.ROLLOUT,6),
                        new MoveLearnSetEntry(Move.SLUDGE,9),
                        new MoveLearnSetEntry(Move.RECYCLE,12),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,15),
                        new MoveLearnSetEntry(Move.SPIT_UP,17),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,20),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,23),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,27),
                        new MoveLearnSetEntry(Move.BELCH,36),
                        new MoveLearnSetEntry(Move.SUGAR_RUSH,40),
                        new MoveLearnSetEntry(Move.SPIRIT_BREAK,44),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,50),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,55)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Confectious");

    }


}