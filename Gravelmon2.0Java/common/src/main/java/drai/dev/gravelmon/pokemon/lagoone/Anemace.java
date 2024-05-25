package drai.dev.gravelmon.pokemon.lagoone;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Anemace extends drai.dev.gravelmon.pokemon.Pokemon {
    public Anemace() {
        super("Anemace",
                Type.POISON, Type.FIGHTING,
                new Stats(90,
                        100,
                        100,
                        50,
                        70,
                        60),
                List.of(Ability.DRY_SKIN), Ability.ROUGH_SKIN,
                12, 480,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                159, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("A brute that fights by swinging its tentacles. They like to display their strength by shattering rocks, sometimes hurting themselves but too prideful to show it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BULK_UP,1),
                        new MoveLearnSetEntry(Move.ASTONISH,5),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,8),
                        new MoveLearnSetEntry(Move.SLUDGE,12),
                        new MoveLearnSetEntry(Move.STUN_SPORE,15),
                        new MoveLearnSetEntry(Move.HEADBUTT,20),
                        new MoveLearnSetEntry(Move.GROWTH,23),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,28),
                        new MoveLearnSetEntry(Move.VENOSHOCK,30),
                        new MoveLearnSetEntry(Move.SLAM,34),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,40),
                        new MoveLearnSetEntry(Move.POISON_JAB,45),
                        new MoveLearnSetEntry(Move.SPORE,50)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 33, 48, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Anemace");

    }


}