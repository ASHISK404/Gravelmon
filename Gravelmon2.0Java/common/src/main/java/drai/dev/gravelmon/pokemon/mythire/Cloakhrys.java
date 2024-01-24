package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cloakhrys extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cloakhrys() {
        super("Cloakhrys",
                Type.BUG,Type.POISON,
                new Stats(50,
                        35,
                        65,
                        50,
                        80,
                        40),
                List.of(Ability.SHIELD_DUST,Ability.UNBURDEN,Ability.TINTED_LENS), Ability.TINTED_LENS,
                8, 165,
                new Stats(0,0,0,0,2,0), 255,
                0.5,
                64, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It filters pollutants out of the air to form its cocoon of toxic smoke. Everything around it within a small radius withers away as it silently awaits evolution."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.TOXIC_THREAD,"tm"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.MOONLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.CUDDLE,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.WEBSLAM,"tm"),
                        new MoveLearnSetEntry(Move.ALLERGYPOLLEN,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cloakhrys");

    }


}
