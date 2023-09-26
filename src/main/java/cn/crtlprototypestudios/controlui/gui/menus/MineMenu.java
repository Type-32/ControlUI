package cn.crtlprototypestudios.controlui.gui.menus;

import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WPlainPanel;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
import io.github.cottonmc.cotton.gui.widget.data.VerticalAlignment;
import net.minecraft.text.Text;

public class MineMenu extends WGridPanel {
    public MineMenu() {
        super(10);
        setSize(500,300);

        WLabel mineTitle = new WLabel(Text.translatable("gui.control_ui.menus.mine.title"));
        mineTitle.setHorizontalAlignment(HorizontalAlignment.CENTER).setVerticalAlignment(VerticalAlignment.CENTER);
        add(mineTitle, 25, 1, 5, 1);

        // Title Row Buttons
        WButton mineSettings = new WButton(Text.translatable("gui.control_ui.menus.mine.buttons.settings"));
        mineSettings.setAlignment(HorizontalAlignment.CENTER).setOnClick(() -> {
            System.out.println("Clicked Settings");
        }).setSize(4, 1);
        add(mineSettings, 1, 1, 5, 1);

        WButton mineAction = new WButton(Text.translatable("gui.control_ui.menus.mine.buttons.execute"));
        mineAction.setAlignment(HorizontalAlignment.CENTER).setOnClick(() -> {
            System.out.println("Clicked Execute");
        }).setSize(4, 1);
        add(mineAction, 6, 1, 4, 1);

        WButton cancelMineAction = new WButton(Text.translatable("gui.control_ui.menus.mine.buttons.cancel"));
        cancelMineAction.setAlignment(HorizontalAlignment.CENTER).setOnClick(() -> {
            System.out.println("Clicked Cancel");
        }).setSize(4, 1);
        add(cancelMineAction, 11, 1, 8, 1);

        // Mineable Blocks Window Buttons
        WButton mineAdd = new WButton(Text.translatable("gui.control_ui.menus.mine.buttons.add"));
        mineAdd.setAlignment(HorizontalAlignment.CENTER).setOnClick(() -> {
            System.out.println("Clicked Add");
        }).setSize(4, 1);
        add(mineAdd, 1, 4, 4, 1);

        WButton mineClear = new WButton(Text.translatable("gui.control_ui.menus.mine.buttons.clear"));
        mineClear.setAlignment(HorizontalAlignment.CENTER).setOnClick(() -> {
            System.out.println("Clicked");
        }).setSize(4, 1);
        add(mineClear, 6, 4, 4, 1);

        // Mine Profiles Window Buttons
        WButton createNewProfile = new WButton(Text.translatable("gui.control_ui.menus.mine.buttons.create_profile"));
        createNewProfile.setAlignment(HorizontalAlignment.CENTER).setOnClick(() -> {
            System.out.println("Clicked");
        }).setSize(4,1);
        add(createNewProfile, 46, 5, 6, 1);
    }
}
