package cn.crtlprototypestudios.controlui.gui;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WTabPanel;
import io.github.cottonmc.cotton.gui.widget.WText;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import io.github.cottonmc.cotton.gui.widget.data.VerticalAlignment;
import net.minecraft.text.Text;

import javax.swing.*;

public class MainGUI extends LightweightGuiDescription {
    public MainGUI() {
        // Root
        WTabPanel tabs = new WTabPanel();
//        tabs.setSize(300,200);
        setRootPanel(tabs);

        // Main Menu
        WGridPanel menu = new WGridPanel();
        menu.setSize(300,200);

        WLabel menuTitle = new WLabel(Text.translatable("gui.control_ui.menus.main.title"));
        menu.add(menuTitle, 0, 0, 4, 1);
        menuTitle.setHorizontalAlignment(HorizontalAlignment.CENTER).setVerticalAlignment(VerticalAlignment.TOP);


        // Mine Menu
        WGridPanel mine = new WGridPanel();
        mine.setSize(300,200);

        WLabel mineTitle = new WLabel(Text.translatable("gui.control_ui.menus.mine.title"));
        mine.add(mineTitle, 0, 0, 4, 1);
        mineTitle.setHorizontalAlignment(HorizontalAlignment.CENTER).setVerticalAlignment(VerticalAlignment.TOP);


        // Add tabs
        tabs.add(menu, tab -> tab.title(Text.translatable("gui.control_ui.tabs.main")));
        tabs.add(mine, tab -> tab.title(Text.translatable("gui.control_ui.tabs.mine")));
        tabs.add(new WGridPanel(), tab -> tab.title(Text.translatable("gui.control_ui.tabs.goal")));
        tabs.add(new WGridPanel(), tab -> tab.title(Text.translatable("gui.control_ui.tabs.waypoint")));
        tabs.add(new WGridPanel(), tab -> tab.title(Text.translatable("gui.control_ui.tabs.settings")));

        tabs.validate(this);
    }
}
