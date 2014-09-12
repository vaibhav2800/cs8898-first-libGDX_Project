package de.cs8898.libGDX.first.stage;

import com.badlogic.gdx.graphics.g2d.BitmapFont;

import de.cs8898.libGDX.first.handlers.GameStageManager;

public class Play extends GameStage{

	private BitmapFont font = new BitmapFont(Gdx.files.internal("data/nameOfFont.fnt"),
         Gdx.files.internal("data/nameOfFont.png"), false);

	public Play(GameStageManager gsm){
		sb.setProjectionMatrix(cam.combined);
		super(gsm);
	}
	
	public void handleInput() {}
	
	public void update(float dt) {}
	
	public void render() {
		sb.begin();
		font.draw(sb,"PLAY Stage",100,100);
		sb.end();
		System.out.println("SOME Render...");
	}
	
	public void dispose() {}
}
