package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Titanoss extends drai.dev.gravelmon.pokemon.Pokemon {
    public Titanoss() {
        super("Titanoss",
                Type.GRASS,Type.GROUND,
                new Stats(90,
                        118,
                        100,
                        63,
                        84,
                        80),
                List.of(Ability.OVERGROW), Ability.SHEER_FORCE,
                8, 165,
                new Stats(0,2,1,0,0,0), 45,
                0.875,
                241, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.GRASS),
                List.of("Evo EarthquakeSTAB Ground - EarthquakeSTAB Ground - Wood HammerSTAB Grass - Hammer Arm Fighting - Rototiller Ground - Megahorn Bug - Pound Normal - Growth Normal 7 AbsorbSTAB Grass 12 Bug Bite Bug 16 Razor LeafSTAB Grass 21 Rock Throw Rock 26 Ingrain Grass 33 BulldozeSTAB Ground 35 Grassy GlideSTAB Grass 38 Stealth Rock Rock 42 Seed BombSTAB Grass 47 Stomping TantrumSTAB Ground 50 Rock Slide Rock 54 Bulk Up Fighting 60 Wood HammerSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.BUG_BITE,12),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,16),
                        new MoveLearnSetEntry(Move.ROCK_THROW,21),
                        new MoveLearnSetEntry(Move.INGRAIN,26),
                        new MoveLearnSetEntry(Move.BULLDOZE,33),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE,35),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,38),
                        new MoveLearnSetEntry(Move.SEED_BOMB,42),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,47),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,50),
                        new MoveLearnSetEntry(Move.BULK_UP,54),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,60),
                        new MoveLearnSetEntry(Move.FRENZY_PLANT,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE,"tm")                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Titanoss");

    }


}
