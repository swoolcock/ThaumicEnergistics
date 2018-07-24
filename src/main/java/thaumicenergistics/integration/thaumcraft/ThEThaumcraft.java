package thaumicenergistics.integration.thaumcraft;

import net.minecraft.util.ResourceLocation;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;

import thaumicenergistics.init.ModGlobals;
import thaumicenergistics.integration.IThEIntegration;

/**
 * @author BrockWS
 */
public class ThEThaumcraft implements IThEIntegration {

    @Override
    public void preInit() {
        ResearchCategories.registerCategory(
                "thaumicenergistics",
                null,
                new AspectList().add(Aspect.FIRE, 1),
                new ResourceLocation(ModGlobals.MOD_ID, "textures/research/icon.png"),
                new ResourceLocation(ModGlobals.MOD_ID, "textures/research/background.png"));
    }

    @Override
    public void init() {

    }

    @Override
    public void postInit() {

    }
}
