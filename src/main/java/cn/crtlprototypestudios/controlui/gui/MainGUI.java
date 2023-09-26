package cn.crtlprototypestudios.controlui.gui;
import cn.crtlprototypestudios.controlui.gui.menus.MainMenu;
import cn.crtlprototypestudios.controlui.gui.menus.MineMenu;
import cn.crtlprototypestudios.controlui.gui.override.ControlUIGUIDescription;
import io.github.cottonmc.cotton.gui.widget.*;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import io.github.cottonmc.cotton.gui.widget.data.VerticalAlignment;
import net.minecraft.text.Text;

import javax.swing.*;

public class MainGUI extends ControlUIGUIDescription {
    public MainGUI() {
        // Root
        WTabPanel tabs = new WTabPanel();
        setRootPanel(tabs);

        // Menus
        MainMenu menu = new MainMenu();
        MineMenu mine = new MineMenu();

        // Add tabs
        tabs.add(menu, tab -> tab.title(Text.translatable("gui.control_ui.tabs.main")));
        tabs.add(mine, tab -> tab.title(Text.translatable("gui.control_ui.tabs.mine")));
        tabs.add(new WGridPanel(), tab -> tab.title(Text.translatable("gui.control_ui.tabs.goal")));
        tabs.add(new WGridPanel(), tab -> tab.title(Text.translatable("gui.control_ui.tabs.waypoint")));
        tabs.add(new WGridPanel(), tab -> tab.title(Text.translatable("gui.control_ui.tabs.settings")));

        tabs.validate(this);
    }
}
