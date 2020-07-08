package com.nf3.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.nf3.game.NF3Envr;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration(); // DESKTOP APPLICATION CONFIG
		new LwjglApplication(new NF3Envr(), config); // NEW DESKTOP INTERFACE (interacts with backend)
		// Pass in a object of the class which extends from ApplicationAdapter OR implements ApplicationListener
		// This object is the "client-side" for the programmer, and the methods specifies what happens when 
		// events occur on the application. e.g. resize() is called when the application is resized AND when
		// the application is run for the first time.
	}
}
