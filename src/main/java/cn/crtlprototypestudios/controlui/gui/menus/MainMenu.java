package cn.crtlprototypestudios.controlui.gui.menus;

import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WPlainPanel;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
import io.github.cottonmc.cotton.gui.widget.data.VerticalAlignment;
import net.minecraft.text.Text;

public class MainMenu extends WPlainPanel {
    public MainMenu(){
        super();
        setSize(500,300);

        WLabel menuTitle = new WLabel(Text.translatable("gui.control_ui.menus.main.title"));
        menuTitle.setVerticalAlignment(VerticalAlignment.TOP).setHorizontalAlignment(HorizontalAlignment.CENTER);
        add(menuTitle, 0, 1, 4, 1);
    }
}
