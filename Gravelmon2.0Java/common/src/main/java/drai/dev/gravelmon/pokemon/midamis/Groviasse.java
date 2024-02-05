package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Groviasse extends drai.dev.gravelmon.pokemon.Pokemon {
    public Groviasse() {
        super("Groviasse",
                Type.NORMAL,Type.FIGHTING,
                new Stats(70,
                        90,
                        80,
                        80,
                        80,
                        110),
                List.of(Ability.CHLOROPHYLL), Ability.SAP_SIPPER,
                8, 165,
                new Stats(0,1,0,0,0,2), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.WATER_1),
                List.of("Probably the most secretive of the Davolee evolution, Groviasse is only seen in thick forests or dense jungles. They are sometimes seen jumping from tree to tree and their hands have adapted for this travel."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.CHARM,5),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,10),
                        new MoveLearnSetEntry(Move.DISABLE,15),
                        new MoveLearnSetEntry(Move.BODY_SLAM,20),
                        new MoveLearnSetEntry(Move.REVENGE,25),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,30),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,35),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,40),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,45),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,50),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,55),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.WATER_GUN,"tm"),
                        new MoveLearnSetEntry(Move.SPLASH,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"tm"),
                        new MoveLearnSetEntry(Move.SOAK,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Groviasse");

    }


}