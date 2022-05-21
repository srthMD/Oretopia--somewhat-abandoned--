package ro.srth.oretopia.entity.render;

import net.minecraft.util.ResourceLocation;
import ro.srth.oretopia.block.custom.RadioumTNT;
import ro.srth.oretopia.entity.RadioumTNTEntity;

public interface IRadioumTNTEntityRenderer {
    ResourceLocation getEntityTexture(RadioumTNTEntity entity);

    ResourceLocation getEntityTexture(RadioumTNT radioumTNT);
}
