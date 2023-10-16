package com.gravelmon.common.gravelmon.pokemon.insurgence.delta;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class DeltaSpiderBeldum extends Pokemon {
    public DeltaSpiderBeldum(int dexNo) {
        super(dexNo,"DeltaSpiderBeldum",
                Type.GROUND, Type.BUG,
                new Stats(40, 55, 80, 35, 60, 30),
                List.of(Ability.POISON_TOUCH, Ability.IMMUNITY), Ability.POISON_HEAL,
                6, 476,
                new Stats(0,0,1,0,0,0), 3,
                -1,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("A Delta Species discovered by Zero_Breaker. It builds webs in trees, ensnaring prey, and then subdues them with its venom."),
                List.of(new EvolutionEntry("deltaspidermetang", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUG_BITE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,5),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,15),
                        new MoveLearnSetEntry(Move.STICKY_WEB,30),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tutor"),
                        new MoveLearnSetEntry(Move.HOLD_BACK,"tutor"),
                        new MoveLearnSetEntry(Move.STRING_SHOT,"tutor"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tutor")
                        ),
                List.of(Label.GEN3,Label.INSURGENCE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.IS_THUNDERING, "true"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Beldum");
        this.setPortraitXYZ(0,1.8,0);
    }
}
