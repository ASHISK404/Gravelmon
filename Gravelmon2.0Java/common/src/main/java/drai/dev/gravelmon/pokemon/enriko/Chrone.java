package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Chrone extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chrone() {
        super("Chrone",
                Type.STEEL,Type.FLYING,
                new Stats(40,
                        65,
                        85,
                        20,
                        65,
                        75),
                List.of(Ability.MOTOR_DRIVE,Ability.LIGHTNING_ROD,Ability.FOREWARN), Ability.FOREWARN,
                8, 165,
                new Stats(0,0,0,0,0,1), 170,
                1.0,
                87, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A presumably manmade Pokémon that can be seen spying on people. It seems to subsist solely on visual stimulation, as it can only die if its lens is blocked for too long."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LOCKON,1)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chrone");

    }


}
