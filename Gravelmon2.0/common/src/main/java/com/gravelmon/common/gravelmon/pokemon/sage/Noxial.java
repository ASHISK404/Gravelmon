package com.gravelmon.common.gravelmon.pokemon.sage;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Noxial extends Pokemon {
    public Noxial() {
        super("Noxial",
                Type.POISON, Type.GHOST,
                new Stats(40, 60, 60, 80, 90, 6),
                List.of(Ability.STENCH, Ability.AFTERMATH), Ability.LIQUID_OOZE,
                9, 17,
                new Stats(0,0,0,0,2,0), 120,
                0.5,
                137, ExperienceGroup.MEDIUM_SLOW,
                70,
                51, List.of(EggGroup.AMORPHOUS),
                List.of("Noxial have been discovered in both endothermic and exothermic forms. The more extreme the temperature, the more volatile the Noxial."),
                List.of(new EvolutionEntry("fumighast", EvolutionType.LEVEL_UP, true, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "\"cobblemon:ice_heal\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_GAS,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SMOG,5),
                        new MoveLearnSetEntry(Move.DISABLE,8),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,12),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,15),
                        new MoveLearnSetEntry(Move.ACID_RAIN,19),
                        new MoveLearnSetEntry(Move.FROST_BREATH,22),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,27),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,31),
                        new MoveLearnSetEntry(Move.ICE_BEAM,36),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,40),
                        new MoveLearnSetEntry(Move.IMPRISON,45),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,49),
                        new MoveLearnSetEntry(Move.BLIZZARD,54),
                        new MoveLearnSetEntry(Move.EXPLOSION,58),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tutor"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tutor"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tutor"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tutor"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SNATCH,"tutor"),
                        new MoveLearnSetEntry(Move.SPITE,"tutor"),
                        new MoveLearnSetEntry(Move.TRICK,"tutor"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"egg"),
                        new MoveLearnSetEntry(Move.CROSS_POISON,"egg"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.GRUDGE,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,"egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"egg"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"egg"),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:leather",100, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 22, 42, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY, Biome.IS_ABYSS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.4, 0.5,
                List.of(new PokemonForm(
                        "Exothermic", false,
                        Type.POISON, Type.GHOST,
                        new Stats(40, 60, 60, 80, 90, 6),
                        List.of(Ability.STENCH, Ability.AFTERMATH), Ability.LIQUID_OOZE,
                        9, 17,
                        new Stats(0,0,0,0,2,0), 120,
                        0.5,
                        137, ExperienceGroup.MEDIUM_SLOW,
                        70,
                        51, List.of(EggGroup.AMORPHOUS),
                        List.of(Aspect.EXOTHERMIC),
                        List.of("Noxial have been discovered in both endothermic and exothermic forms. The more extreme the temperature, the more volatile the Noxial."),
                        List.of(new EvolutionEntry("fumighast", EvolutionType.LEVEL_UP, true, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "\"cobblemon:burn_heal\"")))),
                        List.of(
                                new MoveLearnSetEntry(Move.POISON_GAS,1),
                                new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                                new MoveLearnSetEntry(Move.ASTONISH,1),
                                new MoveLearnSetEntry(Move.SMOG,5),
                                new MoveLearnSetEntry(Move.DISABLE,8),
                                new MoveLearnSetEntry(Move.EMBER,12),
                                new MoveLearnSetEntry(Move.CONFUSE_RAY,15),
                                new MoveLearnSetEntry(Move.ACID_RAIN,19),
                                new MoveLearnSetEntry(Move.FLAME_BURST,22),
                                new MoveLearnSetEntry(Move.SELFDESTRUCT,27),
                                new MoveLearnSetEntry(Move.TOXIC_SPIKES,31),
                                new MoveLearnSetEntry(Move.FLAMETHROWER,36),
                                new MoveLearnSetEntry(Move.SHADOW_BALL,40),
                                new MoveLearnSetEntry(Move.IMPRISON,45),
                                new MoveLearnSetEntry(Move.DESTINY_BOND,49),
                                new MoveLearnSetEntry(Move.FIRE_BLAST,54),
                                new MoveLearnSetEntry(Move.EXPLOSION,58),
                                new MoveLearnSetEntry(Move.TOXIC,"tm"),
                                new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                                new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                                new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                                new MoveLearnSetEntry(Move.TAUNT,"tm"),
                                new MoveLearnSetEntry(Move.PROTECT,"tm"),
                                new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                                new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                                new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                                new MoveLearnSetEntry(Move.RETURN,"tm"),
                                new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                                new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                                new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                                new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                                new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                                new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                                new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                                new MoveLearnSetEntry(Move.TORMENT,"tm"),
                                new MoveLearnSetEntry(Move.FACADE,"tm"),
                                new MoveLearnSetEntry(Move.REST,"tm"),
                                new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                                new MoveLearnSetEntry(Move.THIEF,"tm"),
                                new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                                new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                                new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                                new MoveLearnSetEntry(Move.ENDURE,"tm"),
                                new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                                new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                                new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                                new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                                new MoveLearnSetEntry(Move.FLASH,"tm"),
                                new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                                new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                                new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                                new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                                new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                                new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                                new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                                new MoveLearnSetEntry(Move.STOKE,"tm"),
                                new MoveLearnSetEntry(Move.FLING,"tutor"),
                                new MoveLearnSetEntry(Move.GASTRO_ACID,"tutor"),
                                new MoveLearnSetEntry(Move.GUNK_SHOT,"tutor"),
                                new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                                new MoveLearnSetEntry(Move.MAGIC_COAT,"tutor"),
                                new MoveLearnSetEntry(Move.OMINOUS_WIND,"tutor"),
                                new MoveLearnSetEntry(Move.PAIN_SPLIT,"tutor"),
                                new MoveLearnSetEntry(Move.RECYCLE,"tutor"),
                                new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                                new MoveLearnSetEntry(Move.SNATCH,"tutor"),
                                new MoveLearnSetEntry(Move.SPITE,"tutor"),
                                new MoveLearnSetEntry(Move.TRICK,"tutor"),
                                new MoveLearnSetEntry(Move.CLEAR_SMOG,"egg"),
                                new MoveLearnSetEntry(Move.CROSS_POISON,"egg"),
                                new MoveLearnSetEntry(Move.FEINT_ATTACK,"egg"),
                                new MoveLearnSetEntry(Move.GRUDGE,"egg"),
                                new MoveLearnSetEntry(Move.HAZE,"egg"),
                                new MoveLearnSetEntry(Move.NASTY_PLOT,"egg"),
                                new MoveLearnSetEntry(Move.NIGHT_SHADE,"egg"),
                                new MoveLearnSetEntry(Move.NIGHT_SLASH,"egg"),
                                new MoveLearnSetEntry(Move.OMINOUS_WIND,"egg"),
                                new MoveLearnSetEntry(Move.SMOKESCREEN,"egg")
                        ),
                        List.of(Label.SAGE),
                        2, List.of(
                        new ItemDrop("minecraft:glass_bottle",100, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 22, 42, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY, Biome.IS_ABYSS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                        List.of(SpawnPreset.URBAN),
                        0.4, 0.5
                )));
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
