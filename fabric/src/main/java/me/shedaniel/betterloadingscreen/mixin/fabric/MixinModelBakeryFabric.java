package me.shedaniel.betterloadingscreen.mixin.fabric;

import net.minecraft.client.resources.model.ModelBakery;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ModelBakery.class)
public class MixinModelBakeryFabric {
	//  @Shadow @Final private Map<ResourceLocation, UnbakedModel> topLevelModels;
	//
	//    @Inject(method = "<init>", at = @At(
	//            value = "INVOKE",
	//            target = "Ljava/util/Map;forEach(Ljava/util/function/BiConsumer;)V",
	//            ordinal = 0
	//    ))
	//    private void init(ResourceManager resourceManager, BlockColors blockColors, ProfilerFiller profilerFiller, int i, CallbackInfo ci) {
	//        int stateCount = 0, itemCount = Registry.ITEM.size();
	//
	//        for (Block block : Registry.BLOCK) {
	//            stateCount += block.getStateDefinition().getPossibleStates().size();
	//        }
	//
	//        ParentTask task = LoadGameSteps.loadModel();
	//        SteppedTask blockTask = task.stepped(LoadGameSteps.LoadModel.BLOCK);
	//        blockTask.setTotalSteps(stateCount);
	//        SteppedTask itemTask = task.stepped(LoadGameSteps.LoadModel.ITEM);
	//        itemTask.setTotalSteps(itemCount);
	//        ((ModelBakeryStub) this).betterloadingscreen$setBlockTask(blockTask);
	//        ((ModelBakeryStub) this).betterloadingscreen$setItemTask(itemTask);
	//    }
	//
	//    @Inject(method = "<init>", at = @At(
	//            value = "INVOKE",
	//            target = "Lnet/minecraft/client/resources/model/ModelBakery;loadTopLevel(Lnet/minecraft/client/resources/model/ModelResourceLocation;)V",
	//            ordinal = 1
	//    ), locals = LocalCapture.CAPTURE_FAILHARD)
	//    private void startItem(ResourceManager resourceManager, BlockColors blockColors, ProfilerFiller profilerFiller, int i, CallbackInfo ci,
	//            Iterator iterator, ResourceLocation resourceLocation) {
	//        ((ModelBakeryStub) this).betterloadingscreen$getItemTask().setCurrentStepInfo(resourceLocation.toString());
	//    }
	//
	//    @Inject(method = "<init>", at = @At(
	//            value = "INVOKE",
	//            target = "Lnet/minecraft/client/resources/model/ModelBakery;loadTopLevel(Lnet/minecraft/client/resources/model/ModelResourceLocation;)V",
	//            ordinal = 1,
	//            shift = At.Shift.AFTER
	//    ))
	//    private void endItem(ResourceManager resourceManager, BlockColors blockColors, ProfilerFiller profilerFiller, int i, CallbackInfo ci) {
	//        ((ModelBakeryStub) this).betterloadingscreen$getItemTask().incrementStep();
	//    }
	//
	//    @Inject(method = "<init>", at = @At(
	//            value = "INVOKE",
	//            target = "Ljava/util/stream/Stream;flatMap(Ljava/util/function/Function;)Ljava/util/stream/Stream;",
	//            ordinal = 0
	//    ))
	//    private void initPrepare(ResourceManager resourceManager, BlockColors blockColors, ProfilerFiller profilerFiller, int i, CallbackInfo ci) {
	//        SteppedTask task = LoadGameSteps.prepareModel();
	//        task.setTotalSteps(topLevelModels.size());
	//    }
	//
	//    @Inject(method = "method_4732", at = @At(
	//            value = "RETURN"
	//    ))
	//    private void endPrepare(Set set, UnbakedModel model, CallbackInfoReturnable ci) {
	//        SteppedTask task = LoadGameSteps.prepareModel();
	//        task.incrementStep();
	//    }
}
