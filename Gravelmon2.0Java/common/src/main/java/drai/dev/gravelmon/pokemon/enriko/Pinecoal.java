package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Pinecoal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pinecoal() {
        super("Pinecoal",
                Type.GRASS,Type.FIRE,
                new Stats(50,
                        30,
                        80,
                        80,
                        60,
                        20),
                List.of(Ability.WATER_ABSORB,Ability.FLARE_BOOST,Ability.FLAME_BODY), Ability.FLAME_BODY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("It falls from trees in the cold parts of Enriko. To reproduce, it requires to be bathed in the heat of a forest fire to spread it's seeds."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,5),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.VINE_WHIP,10),
                        new MoveLearnSetEntry(Move.LEECH_SEED,13),
                        new MoveLearnSetEntry(Move.SYNTHESIS,16),
                        new MoveLearnSetEntry(Move.BULLDOZE,20),
                        new MoveLearnSetEntry(Move.INGRAIN,24),
                        new MoveLearnSetEntry(Move.FLAME_BURST,28),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,32),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,38),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,42),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,46),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,54),
                        new MoveLearnSetEntry(Move.EXPLOSION,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pinecoal");

    }


}