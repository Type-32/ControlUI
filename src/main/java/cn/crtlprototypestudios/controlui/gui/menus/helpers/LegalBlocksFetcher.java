package cn.crtlprototypestudios.controlui.gui.menus.helpers;

import baritone.api.command.datatypes.ForBlockOptionalMeta;
import net.minecraft.block.Block;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.BlockTags;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class LegalBlocksFetcher {
    @Nullable
    public static ArrayList<Block> fetch() {
        Registry<Block> blockRegistry = Registries.BLOCK;

        ArrayList<Block> legalBlocks = new ArrayList<Block>();
        blockRegistry.forEach((block) -> {
            legalBlocks.add(block);
        });
        return legalBlocks;
    }
}
