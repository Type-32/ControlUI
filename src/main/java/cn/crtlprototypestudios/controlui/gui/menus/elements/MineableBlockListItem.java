package cn.crtlprototypestudios.controlui.gui.menus.elements;

import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WPlainPanel;
import io.github.cottonmc.cotton.gui.widget.WSprite;
import net.minecraft.block.Block;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MineableBlockListItem extends WPlainPanel {
    WSprite blockIcon;
    WLabel blockName;
    WLabel blockId;

    public MineableBlockListItem(Block block) {
        blockIcon = new WSprite(block.getLootTableId());
        blockName = new WLabel(Text.translatable(block.getTranslationKey()));
        blockId = new WLabel(Text.literal(block.getLootTableId().toString()));
        add(blockIcon, 0, 0, 16, 16);
        add(blockName, 16, 0, 16, 16);
        add(blockId, 32, 0, 16, 16);

        this.setSize(48, 16);
    }
}
