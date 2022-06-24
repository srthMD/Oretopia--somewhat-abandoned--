package ro.srth.oretopia.integration;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import net.minecraft.util.ResourceLocation;
import ro.srth.oretopia.oretopia;


@JeiPlugin
public class oretopiaJEI implements IModPlugin{
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(oretopia.MOD_ID, "jei_plugin");
    }
}
