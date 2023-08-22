package cn.crtlprototypestudios.controlui.events.inputs;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class InputKeyHandler {
    public static final KeyBinding OPEN_CONTROL_UI = new KeyBinding("key.control_ui.open", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_0, "category.control_ui");
    public static final KeyBinding CANCEL_ALL_ACTIONS = new KeyBinding("key.control_ui.cancel_all_actions", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_F7, "category.control_ui");
    public static final KeyBinding PAUSE_ALL_ACTIONS = new KeyBinding("key.control_ui.pause_all_actions", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_F6, "category.control_ui");
}
