package cn.crtlprototypestudios.controlui.client;

// Import Fabric UI libraries
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

// Baritone API imports
import baritone.api.BaritoneAPI;
import baritone.api.pathing.goals.Goal;
import baritone.api.process.IBaritoneProcess;
import baritone.api.process.PathingCommand;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

@Environment(EnvType.CLIENT)
public class ControlUIClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        // Register a HUD element
        HudRenderCallback.EVENT.register((matrixStack, tickDelta) -> {

            // Render UI elements here using matrixStack

        });

        // Handle input to send Baritone commands
        InputEventHandler.registerKeyBinding(KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.categories.misc", // Translation key for name
                InputUtil.Type.KEYSYM, // Type
                GLFW.GLFW_KEY_B, // Default key
                "key.categories.gameplay" // Translation key for category
        )), new InputEventHandler.KeyBindingHandler(){

            @Override
            public void onKeyBindingPressed(@NotNull InputActionEvent event) {
                // Send Baritone command on key press
                BaritoneAPI.getProvider().getPrimaryBaritone().getCommandManager().execute(new PathingCommand<>((Goal) null));
            }

        });

    }

}