package btw.community.difficultytweak;

import btw.AddonHandler;
import btw.BTWAddon;
import btw.world.util.difficulty.Difficulties;
import btw.world.util.difficulty.Difficulty;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class difficultytweakAddon extends BTWAddon {
    private static difficultytweakAddon instance;

    public difficultytweakAddon() {
        super();
    }

    @Override
    public void initialize() {
        AddonHandler.logMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");
    }
}


