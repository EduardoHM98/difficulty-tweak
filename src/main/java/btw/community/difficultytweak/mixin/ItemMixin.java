package btw.community.difficultytweak.mixin;

import net.minecraft.src.EntityItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(EntityItem.class)
public class ItemMixin {

    @Shadow private long absoluteItemDespawnTime;

    @Inject(method = "setEntityItemAsDroppedOnPlayerDeath", at = @At("TAIL"), remap = false)
    private void injected(CallbackInfo ci) {

        System.out.println("old: " + absoluteItemDespawnTime);
        this.absoluteItemDespawnTime = 1L;
        System.out.println("new: " + absoluteItemDespawnTime);
    }
}
