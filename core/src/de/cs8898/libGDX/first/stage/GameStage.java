package de.cs8898.libGDX.first.stage;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import de.cs8898.libGDX.first.handlers.GameStageManager;

public abstract class GameStage {
	protected GameStageManager gsm;
	protected de.cs8898.libGDX.first.main main;
	
	protected SpriteBatch sb;
	protected OrthographicCamera cam;
	protected OrthographicCamera hudCam;
	
	protected GameStage( GameStageManager gsm) {
		this.gsm = gsm;
		main = gsm.main;
		sb = main.getSpriteBatch();
		cam = main.getCamera();
		hudCam = main.getHUDCamera();
	}
	
	public abstract void handleInput();
	public abstract void update(float dt);
	public abstract void render();
	public abstract void dispose();
}
