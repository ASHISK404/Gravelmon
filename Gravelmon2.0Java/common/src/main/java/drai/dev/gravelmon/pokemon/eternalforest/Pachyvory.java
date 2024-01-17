package drai.dev.gravelmon.pokemon.eternalforest;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Pachyvory extends Pokemon {
    public Pachyvory() {
        super("Pachyvory",
                Type.FIRE, Type.PSYCHIC,
                new Stats(108,
                        85,
                        106,
                        85,
                        106,
                        40),
                List.of(Ability.BLAZE, Ability.FLAME_BODY), Ability.STRENGTHENING,
                16, 5200,
                new Stats(1,0,1,0,1,0), 45,
                0.875,
                209, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Pachyvory's tusks are very resistant. When they become too big, it melts the end with its fiery breath."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL, 1),
                        new MoveLearnSetEntry(Move.EMBER, 6),
                        new MoveLearnSetEntry(Move.PSYWAVE, 8),
                        new MoveLearnSetEntry(Move.MEDITATE, 10),
                        new MoveLearnSetEntry(Move.ROLLOUT, 13),
                        new MoveLearnSetEntry(Move.CONFUSION, 18),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH, 22),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL, 27),
                        new MoveLearnSetEntry(Move.PROTECT, 31),
                        new MoveLearnSetEntry(Move.BULLDOZE, 36),
                        new MoveLearnSetEntry(Move.STOMP, 44),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, 52),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT, 60),
                        new MoveLearnSetEntry(Move.CURSE, 67),
                        new MoveLearnSetEntry(Move.MAGMABALL, 72),
                        new MoveLearnSetEntry(Move.EXTRASENSORY, 77),
                        new MoveLearnSetEntry(Move.BODY_SLAM, 87),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 92),
                        new MoveLearnSetEntry(Move.HORN_DRILL, 98),
                        new MoveLearnSetEntry(Move.CALM_MIND, 104),
                        new MoveLearnSetEntry(Move.BURNINGWALL, 110),
                        new MoveLearnSetEntry(Move.PSYCHIC, 116),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ, 122),
                        new MoveLearnSetEntry(Move.PYROKINESIS, 134),
                        new MoveLearnSetEntry(Move.ERUPTION, 140),
                        new MoveLearnSetEntry(Move.BLAST_BURN, 150),

                        new MoveLearnSetEntry(Move.DEFOG, "tutor"),
                        new MoveLearnSetEntry(Move.CALM_MIND, "tutor"),
                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCHIC, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.TORMENT, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP, "tutor"),
                        new MoveLearnSetEntry(Move.SNATCH, "tutor"),
                        new MoveLearnSetEntry(Move.OVERHEAT, "tutor"),
                        new MoveLearnSetEntry(Move.ROOST, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.WILLOWISP, "tutor"),
                        new MoveLearnSetEntry(Move.EXPLOSION, "tutor"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tutor"),
                        new MoveLearnSetEntry(Move.FLASH, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "tutor"),
                        new MoveLearnSetEntry(Move.DREAM_EATER, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM, "tutor"),
                        new MoveLearnSetEntry(Move.PSYSHOCK, "tutor"),
                        new MoveLearnSetEntry(Move.KINESIS, "tutor"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH, "tutor"),
                        new MoveLearnSetEntry(Move.INCINERATE, "tutor"),
                        new MoveLearnSetEntry(Move.RETALIATE, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.PERCEPTION, "tutor"),
                        new MoveLearnSetEntry(Move.MEDITATION, "tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH, "tutor"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tutor"),
                        new MoveLearnSetEntry(Move.AVALANCHE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT, "tutor"),
                        new MoveLearnSetEntry(Move.SCALD, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.TECTONICSHOCK, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),

                        new MoveLearnSetEntry(Move.GUNK_SHOT, "egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH, "egg"),
                        new MoveLearnSetEntry(Move.HEADBUTT, "egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH, "egg"),
                        new MoveLearnSetEntry(Move.IRON_HEAD, "egg"),
                        new MoveLearnSetEntry(Move.FLAME_BURST, "egg"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "egg"),
                        new MoveLearnSetEntry(Move.YAWN, "egg"),
                        new MoveLearnSetEntry(Move.SLACK_OFF, "egg"),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT, "egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT, "egg")
                ),
                List.of(Label.ETERNAL_FOREST),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
    }
}
