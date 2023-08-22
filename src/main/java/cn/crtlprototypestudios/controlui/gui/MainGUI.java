package cn.crtlprototypestudios.controlui.gui;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;

public class MainGUI extends LightweightGuiDescription {
    public MainGUI() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(300, 200);
        root.add(new WGridPanel(), 0, 0, 1, 1);
    }
}
