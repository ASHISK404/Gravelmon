package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Clustar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Clustar() {
        super("Clustar",
                Type.DARK,Type.ROCK,
                new Stats(55,
                        40,
                        85,
                        105,
                        70,
                        50),
                List.of(Ability.LEVITATE), Ability.DARKHOLD,
                8, 165,
                new Stats(0,0,0,2,0,0), 110,
                0.0,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FAIRY),
                List.of("The opposite forces each star emits is what keeps it levitating. If one of the two loses its glow, the other will lend its energy so that they can mantain balance."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TELEPORT,1),
                        new MoveLearnSetEntry(Move.MAGIC_POWDER,5),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,9),
                        new MoveLearnSetEntry(Move.ASSURANCE,13),
                        new MoveLearnSetEntry(Move.IMPRISON,17),
                        new MoveLearnSetEntry(Move.SWIFT,21),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,24),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,27),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,31),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,35),
                        new MoveLearnSetEntry(Move.MOONLIGHT,40),
                        new MoveLearnSetEntry(Move.METEORSHOWER,45),
                        new MoveLearnSetEntry(Move.GRAVITY,49),
                        new MoveLearnSetEntry(Move.STARSTREAM,56),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,64),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Clustar");

    }


}