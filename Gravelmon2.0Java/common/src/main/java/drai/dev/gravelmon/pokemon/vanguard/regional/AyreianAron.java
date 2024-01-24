package drai.dev.gravelmon.pokemon.vanguard.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class AyreianAron extends Pokemon {
    public AyreianAron(int dexNo) {
        super(dexNo,"AyreianAron",
                Type.FIRE, Type.ROCK,
                new Stats(40,60,80,40,70,40),
                List.of(Ability.STURDY, Ability.ROCK_HEAD), Ability.HEAVY_METAL,
                4, 600,
                new Stats(0,0,1,0,0,0), 180,
                0.5,
                75, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("When Aron evolves, it leaves behind molten pebbles. In ancient times, people would collect Aron's shed rocks to warm themselves."),
                List.of(new EvolutionEntry("ayreianlairon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.HARDEN, 1),
                        new MoveLearnSetEntry(Move.METAL_CLAW, 1),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, 1),
                        new MoveLearnSetEntry(Move.ROAR, 12),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, 16),
                        new MoveLearnSetEntry(Move.PROTECT, 20),
                        new MoveLearnSetEntry(Move.LAVA_PLUME, 24),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, 28),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, 35),
                        new MoveLearnSetEntry(Move.BODY_PRESS, 40),
                        new MoveLearnSetEntry(Move.ROCK_POLISH, 48),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM, 56),
                        new MoveLearnSetEntry(Move.STONE_EDGE, 64),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ, 72),
                        new MoveLearnSetEntry(Move.METEOR_BEAM, 80),
                        new MoveLearnSetEntry(Move.ERUPTION, 88),

                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.AVALANCHE, "tutor"),
                        new MoveLearnSetEntry(Move.BLOCK, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_PRESS, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK, "tutor"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.CRUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.CUT, "tutor"),
                        new MoveLearnSetEntry(Move.DARK_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW, "tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, "tutor"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.LOW_KICK, "tutor"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE, "tutor"),
                        new MoveLearnSetEntry(Move.MEGA_KICK, "tutor"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE, "tutor"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tutor"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.REVERSAL, "tutor"),
                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SANDSTORM, "tutor"),
                        new MoveLearnSetEntry(Move.SAND_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SCARY_FACE, "tutor"),
                        new MoveLearnSetEntry(Move.SCREECH, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, "tutor"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, "tutor"),
                        new MoveLearnSetEntry(Move.SMART_STRIKE, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SPITE, "tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "tutor"),
                        new MoveLearnSetEntry(Move.STEEL_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER, "tutor"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM, "tutor"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),

                        new MoveLearnSetEntry(Move.MAGNITUDE, "egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE, "egg"),
                        new MoveLearnSetEntry(Move.BLOCK, "egg"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "egg"),
                        new MoveLearnSetEntry(Move.ENDURE, "egg"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD, "egg")
                ),
                List.of(Label.GEN3,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 5, 25, 7, List.of(
                ), List.of(),
                List.of(SpawnPreset.NEAR_LAVA),
                0.29, 0.3,
                List.of());
        this.setLangFileName("Aron");
        this.setPortraitXYZ(0,1.8,0);
    }
}
