package drai.dev.gravelmon.pokemon.lagoone;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Dynamight extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dynamight() {
        super("Dynamight",
                Type.FIRE, Type.DARK,
                new Stats(75,
                        109,
                        72,
                        75,
                        70,
                        99),
                List.of(Ability.FLAME_BODY), Ability.AFTERMATH,
                11, 210,
                new Stats(0,2,0,0,0,0), 70,
                0.5,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("When angered too much its tail starts flickering as it is prone to explode. They have an appetite for burning wood and charcoal so setting campfire near mountains is ill advised."),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.INCINERATE,7),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,15),
                        new MoveLearnSetEntry(Move.FLAME_BURST,20),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,24),
                        new MoveLearnSetEntry(Move.EXPLOSION,30),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,35),
                        new MoveLearnSetEntry(Move.LIGHTUP,39),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,44),
                        new MoveLearnSetEntry(Move.OVERHEAT,50),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,54),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,59),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,63)             ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 38, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dynamight");

    }


}