package cn.crtlprototypestudios.controlui.client;

// Import Fabric UI libraries
import cn.crtlprototypestudios.controlui.events.inputs.InputKeyHandler;
import cn.crtlprototypestudios.controlui.gui.MainGUI;
import cn.crtlprototypestudios.controlui.gui.MainScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;

// Baritone API imports

// Minecraft


@Environment(EnvType.CLIENT)
public class ControlUIClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while(InputKeyHandler.TOGGLE_CONTROL_UI.wasPressed()) {
                System.out.println("Toggled Control UI");
                MinecraftClient.getInstance().setScreen(new MainScreen(new MainGUI()));
            }
            while(InputKeyHandler.CANCEL_ALL_ACTIONS.wasPressed()) {
                System.out.println("Cancelled all actions");
            }
        });
        KeyBindingHelper.registerKeyBinding(InputKeyHandler.TOGGLE_CONTROL_UI);
        KeyBindingHelper.registerKeyBinding(InputKeyHandler.CANCEL_ALL_ACTIONS);
        KeyBindingHelper.registerKeyBinding(InputKeyHandler.PAUSE_ALL_ACTIONS);
    }

}