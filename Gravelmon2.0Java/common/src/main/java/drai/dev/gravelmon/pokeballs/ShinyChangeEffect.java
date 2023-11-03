package drai.dev.gravelmon.pokeballs;

import com.cobblemon.mod.common.api.pokeball.catching.*;
import com.cobblemon.mod.common.pokemon.*;
import net.minecraft.world.entity.*;
import org.jetbrains.annotations.*;

public class ShinyChangeEffect implements CaptureEffect {
    @Override
    public void apply(@NotNull LivingEntity livingEntity, @NotNull Pokemon pokemon) {
        var aspects = pokemon.getAspects();
        aspects.add("shiny");
        pokemon.setAspects(aspects);
    }
}
