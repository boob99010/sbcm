import java.nio.file.Paths;

import com.rapidminer.gui.RapidMinerGUI;
import com.rapidminer.gui.ToolbarGUIStartupListener;
import com.rapidminer.tools.PlatformUtilities;

class GuiLauncher {
	public static void main(String args[]) throws Exception {
		System.setProperty("com.apple.macos.useScreenMenuBar","true");
		System.setProperty("apple.laf.useScreenMenuBar", "true");
		
		System.setProperty(PlatformUtilities.PROPERTY_RAPIDMINER_HOME, Paths.get("").toAbsolutePath().toString());
		RapidMinerGUI.registerStartupListener(new ToolbarGUIStartupListener());
		RapidMinerGUI.main(args);
	}
}