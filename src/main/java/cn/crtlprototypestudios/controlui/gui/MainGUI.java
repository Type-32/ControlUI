package cn.crtlprototypestudios.controlui.gui;
import cn.crtlprototypestudios.controlui.gui.override.ControlUIGUIDescription;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
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
//        tabs.setBackgroundPainter(null);
        tabs.setSize(300,200);
        setRootPanel(tabs);

        // Main Menu
        WPlainPanel menu = new WPlainPanel();
        menu.setSize(300,200);

        WLabel menuTitle = new WLabel(Text.translatable("gui.control_ui.menus.main.title"));
        menuTitle.setVerticalAlignment(VerticalAlignment.TOP).setHorizontalAlignment(HorizontalAlignment.CENTER);
        menu.add(menuTitle, 150, 10, 4, 1);


        // Mine Menu
        WPlainPanel mine = new WPlainPanel();
        mine.setSize(300,200);

        WLabel mineTitle = new WLabel(Text.translatable("gui.control_ui.menus.mine.title"));
        mineTitle.setHorizontalAlignment(HorizontalAlignment.CENTER).setVerticalAlignment(VerticalAlignment.TOP);
        mine.add(mineTitle, 150, 10, 4, 1);

        WButton mineAdd = new WButton(Text.translatable("gui.control_ui.menus.mine.add"));
        mineAdd.setSize(100, 20);
        mineAdd.setOnClick(() -> {
            System.out.println("Clicked");
        });
        mine.add(mineAdd, 0, 1, 1, 1);


        // Add tabs
        tabs.add(menu, tab -> tab.title(Text.translatable("gui.control_ui.tabs.main")));
        tabs.add(mine, tab -> tab.title(Text.translatable("gui.control_ui.tabs.mine")));
        tabs.add(new WGridPanel(), tab -> tab.title(Text.translatable("gui.control_ui.tabs.goal")));
        tabs.add(new WGridPanel(), tab -> tab.title(Text.translatable("gui.control_ui.tabs.waypoint")));
        tabs.add(new WGridPanel(), tab -> tab.title(Text.translatable("gui.control_ui.tabs.settings")));

        tabs.validate(this);
    }
}
