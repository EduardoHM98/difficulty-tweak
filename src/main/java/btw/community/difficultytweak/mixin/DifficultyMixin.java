package btw.community.difficultytweak.mixin;

import btw.world.util.difficulty.Difficulty;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Difficulty.class)
public class DifficultyMixin
{
    @Inject(method = "getDeathCountBeforeItemDestruction", at = @At("RETURN"), cancellable = true, remap = false)
    void DeathMixin(CallbackInfoReturnable<Integer> cir)
    {
        //System.out.println("getDeathCountBeforeItemDestruction");

        cir.setReturnValue(-1);
    }

//    @Inject(method = "getCowKickStrengthMultiplier", at = @At("RETURN"), cancellable = true, remap = false)
//    void CowhoofMixin(CallbackInfoReturnable<Float> cir)
//    {
//        cir.setReturnValue(4.0F);
//    }
}

