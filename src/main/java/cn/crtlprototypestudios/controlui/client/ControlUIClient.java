package cn.crtlprototypestudios.controlui.client;

// Import Fabric UI libraries
import cn.crtlprototypestudios.controlui.events.inputs.InputKeyHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

// Baritone API imports
import baritone.api.BaritoneAPI;
import baritone.api.pathing.goals.Goal;
import baritone.api.process.PathingCommand;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.jetbrains.annotations.NotNull;

// Minecraft
import net.minecraft.client.MinecraftClient;

@Environment(EnvType.CLIENT)
public class ControlUIClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while(InputKeyHandler.OPEN_CONTROL_UI.wasPressed()) {

            }
            while(InputKeyHandler.OPEN_CONTROL_UI.wasPressed()) {

            }
        });
        KeyBindingHelper.registerKeyBinding(InputKeyHandler.OPEN_CONTROL_UI);
        KeyBindingHelper.registerKeyBinding(InputKeyHandler.CANCEL_ALL_ACTIONS);
        KeyBindingHelper.registerKeyBinding(InputKeyHandler.PAUSE_ALL_ACTIONS);
    }

}