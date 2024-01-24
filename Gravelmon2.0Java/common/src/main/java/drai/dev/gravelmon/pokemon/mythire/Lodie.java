package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Lodie extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lodie() {
        super("Lodie",
                Type.ELECTRIC,
                new Stats(35,
                        40,
                        80,
                        60,
                        75,
                        30),
                List.of(Ability.LEVITATE,Ability.PLUS,Ability.MAGNET_PULL), Ability.MAGNET_PULL,
                8, 165,
                new Stats(0,0,1,0,0,0), 150,
                0.5,
                64, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("The magnetic field generated by Lodie causes it to attract others of its kind, creating colonies. When two Lodie collide, they emit a wave of electric energy as long as they're making contact."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1)                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lodie");

    }


}
