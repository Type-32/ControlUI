package cn.crtlprototypestudios.controlui.gui;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WTabPanel;
import io.github.cottonmc.cotton.gui.widget.WText;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.text.Text;

public class MainGUI extends LightweightGuiDescription {
    public MainGUI() {
        // Add tabs
        WTabPanel tabs = new WTabPanel();
        setRootPanel(tabs);

        //Initialize Menus
        WGridPanel menu = new WGridPanel();
        menu.setSize(300,200);
        menu.add(new WText(Text.translatable("gui.control_ui.menus.main.title")), 0, 0);

        // Add Menus to Tabs
        tabs.add(menu, tab -> tab.title(Text.translatable("gui.control_ui.tabs.main")));
        tabs.add(menu, tab -> tab.title(Text.translatable("gui.control_ui.tabs.mine")));
        tabs.add(new WGridPanel(), tab -> tab.title(Text.translatable("gui.control_ui.tabs.goal")));
        tabs.add(new WGridPanel(), tab -> tab.title(Text.translatable("gui.control_ui.tabs.waypoint")));
        tabs.add(new WGridPanel(), tab -> tab.title(Text.translatable("gui.control_ui.tabs.settings")));

        tabs.validate(this);
    }
}
