package drai.dev.gravelmon.pokemon.cyare;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Wubunny extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wubunny() {
        super("Wubunny",
                Type.NORMAL,
                new Stats(130,
                        85,
                        55,
                        25,
                        85,
                        95),
                List.of(Ability.CUTE_CHARM), Ability.MOODY,
                14, 329,
                new Stats(2,0,0,0,0,0), 190,
                0.5,
                80, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of("Wubunny are absolute joys to be around, typically bringing snacks to share with nearby Pokemon and trainers when they leave their dens. They often are found scavenging for whatever they can get their hands on, as they hate to waste."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.CHARM,5),
                        new MoveLearnSetEntry(Move.COVET,9),
                        new MoveLearnSetEntry(Move.ROLLOUT,12),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,15),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,19),
                        new MoveLearnSetEntry(Move.BULLET_SEED,22),
                        new MoveLearnSetEntry(Move.SLAM,26),
                        new MoveLearnSetEntry(Move.REST,30),
                        new MoveLearnSetEntry(Move.SNORE,32),
                        new MoveLearnSetEntry(Move.BODY_SLAM,36),
                        new MoveLearnSetEntry(Move.BATON_PASS,40),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,45),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,50)                        ),
                List.of(Label.CYARE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wubunny");

    }


}
