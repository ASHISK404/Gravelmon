package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Akakeru extends drai.dev.gravelmon.pokemon.Pokemon {
    public Akakeru() {
        super("Akakeru",
                Type.FIGHTING,
                new Stats(35,
                        35,
                        35,
                        35,
                        35,
                        35),
                List.of(Ability.ANTICIPATION,Ability.VITAL_SPIRIT), Ability.STEADFAST,
                7, 230,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("It is frequently seen rigorously exercising; it will not stop until it reaches evolution. It will choose a certain training regimen until evolution happens."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,5),
                        new MoveLearnSetEntry(Move.DETECT,10),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,15),
                        new MoveLearnSetEntry(Move.HEADBUTT,20),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,25)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Akakeru");

    }


}