package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Plurshie extends drai.dev.gravelmon.pokemon.Pokemon {
    public Plurshie() {
        super("Plurshie",
                Type.GHOST,
                new Stats(71,
                        77,
                        50,
                        31,
                        41,
                        35),
                List.of(Ability.RATTLED), Ability.TANTRUM,
                8, 165,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("If it's left alone for too long, it will throw a tantrum. Plurshie are traditionally given as gifts to young trainers in carnivals and fairs."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,2),
                        new MoveLearnSetEntry(Move.SPITE,6),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,10),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,14),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,18),
                        new MoveLearnSetEntry(Move.FRUSTRATION,23),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,28),
                        new MoveLearnSetEntry(Move.BODY_SLAM,33),
                        new MoveLearnSetEntry(Move.CURSE,35),
                        new MoveLearnSetEntry(Move.LASH_OUT,37),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,41),
                        new MoveLearnSetEntry(Move.GRUDGE,45),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,49),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,54),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.REVERSAL,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.FLAIL,"tm"),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Plurshie");

    }


}