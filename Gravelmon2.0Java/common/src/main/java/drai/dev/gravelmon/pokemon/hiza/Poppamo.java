package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Poppamo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Poppamo() {
        super("Poppamo",
                Type.WATER,
                new Stats(50,
                        25,
                        20,
                        45,
                        30,
                        25),
                List.of(Ability.WATER_BUBBLE), Ability.RAIN_DISH,
                8, 165,
                new Stats(1,0,0,0,0,0), 190,
                0.5,
                88, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("Poppamo can be seen floating around riverbanks. A large concentration of Poppamo is a sign that the water is warm."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.AIRBUBBLE,10),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,16),
                        new MoveLearnSetEntry(Move.UPROAR,19),
                        new MoveLearnSetEntry(Move.AQUA_RING,24),
                        new MoveLearnSetEntry(Move.RECOVER,31),
                        new MoveLearnSetEntry(Move.SOAK,35),
                        new MoveLearnSetEntry(Move.BOUNCE,40),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.CHILLING_WATER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm")                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Poppamo");

    }


}
