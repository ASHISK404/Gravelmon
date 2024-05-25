package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Carefeely extends drai.dev.gravelmon.pokemon.Pokemon {
    public Carefeely() {
        super("Carefeely",
                Type.NORMAL, Type.FAIRY,
                new Stats(105,
                        60,
                        85,
                        60,
                        85,
                        50),
                List.of(Ability.TELEPATHY,Ability.FRIEND_GUARD), Ability.SYNCHRONIZE,
                19, 300,
                new Stats(2,0,0,0,0,0), 0,
                0.5,
                390, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Carefeely");

    }


}