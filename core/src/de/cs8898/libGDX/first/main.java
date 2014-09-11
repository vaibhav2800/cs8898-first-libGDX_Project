package de.cs8898.libGDX.first;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import de.cs8898.libGDX.first.handlers.GameStageManager;

public class main extends Game {
	/*
	 * Allgemeine Einstellungen für Titel und einstellungen
	 */
	public static final String TITEL = "first libGDX Project";
	//protected static final String VERSION = "0.0.1 dev-version";
	public static final int[] windowDimension = {800,600};
	
	public static final float STEP = 1 / 60f;
	private float accum;
	
	private SpriteBatch sb;
	private OrthographicCamera cam;
	private OrthographicCamera hudCam;
	
	private GameStageManager gsm;
	
	public SpriteBatch getSpriteBatch() { return sb; }
	public OrthographicCamera getCamera() { return cam; }
	public OrthographicCamera getHUDCamera() { return hudCam; }
	
	@Override
	public void create() {
		sb = new SpriteBatch();
		cam = new OrthographicCamera();
		cam.setToOrtho(false, windowDimension[0],windowDimension[1]);
		hudCam = new OrthographicCamera();
		hudCam.setToOrtho(false, windowDimension[0],windowDimension[1]);
		
		gsm = new GameStageManager(this);
	}
	
	public void render(){
		accum += Gdx.graphics.getDeltaTime();
		while(accum >= STEP) {
			accum -= STEP;
			gsm.update(STEP);
			gsm.render();
		}
	}
	
}