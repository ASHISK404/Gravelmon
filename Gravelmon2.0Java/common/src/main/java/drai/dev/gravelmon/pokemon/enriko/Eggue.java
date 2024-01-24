package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Eggue extends drai.dev.gravelmon.pokemon.Pokemon {
    public Eggue() {
        super("Eggue",
                Type.POISON,
                new Stats(30,
                        70,
                        65,
                        50,
                        65,
                        40),
                List.of(Ability.POISON_POINT,Ability.WEAK_ARMOR,Ability.GOOEY), Ability.GOOEY,
                8, 165,
                new Stats(0,1,0,0,0,0), 240,
                0.5,
                68, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.AMORPHOUS),
                List.of("It is a bird Pokémon's worst nightmare to find their eggs replaced with Eggue. Anything pulled into its shell is impossible to get back."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ACID,5),
                        new MoveLearnSetEntry(Move.POISON_GAS,9),
                        new MoveLearnSetEntry(Move.WITHDRAW,12),
                        new MoveLearnSetEntry(Move.POISON_FANG,17),
                        new MoveLearnSetEntry(Move.ROLLOUT,20),
                        new MoveLearnSetEntry(Move.GROWTH,24),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,29),
                        new MoveLearnSetEntry(Move.POISON_JAB,35),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,39),
                        new MoveLearnSetEntry(Move.GLARE,46),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,54),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,63),
                        new MoveLearnSetEntry(Move.OUTRAGE,72)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Eggue");

    }


}
