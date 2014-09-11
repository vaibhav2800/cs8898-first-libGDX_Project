package de.cs8898.libGDX.first.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import de.cs8898.libGDX.first.main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = main.TITEL;
		config.useGL30 = true;
		config.width = main.windowDimension[0];
		config.height = main.windowDimension[1];
		config.fullscreen = config.resizable = false;
		new LwjglApplication(new main(), config);
	}
}
