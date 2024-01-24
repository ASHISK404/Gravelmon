package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Clambat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Clambat() {
        super("Clambat",
                Type.FIGHTING,Type.WATER,
                new Stats(45,
                        60,
                        80,
                        30,
                        50,
                        20),
                List.of(Ability.SHELL_ARMOR,Ability.HYDRATION,Ability.SWIFT_SWIM), Ability.SWIFT_SWIM,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Its long tongue is pure, densely packed muscle. It punches holes in the tidepool rocks to build its home inside of."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.POUND,5),
                        new MoveLearnSetEntry(Move.AQUA_JET,7),
                        new MoveLearnSetEntry(Move.PROTECT,11),
                        new MoveLearnSetEntry(Move.DISABLE,15),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,18),
                        new MoveLearnSetEntry(Move.AQUA_RING,22),
                        new MoveLearnSetEntry(Move.DIG,25),
                        new MoveLearnSetEntry(Move.FLIP_TURN,29),
                        new MoveLearnSetEntry(Move.REVENGE,32),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,37),
                        new MoveLearnSetEntry(Move.BULK_UP,41),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,46),
                        new MoveLearnSetEntry(Move.LIQUIDATION,50),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,54),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,58),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,65)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Clambat");

    }


}
