package de.cs8898.libGDX.first.handlers;

import java.util.Stack;

import de.cs8898.libGDX.first.stage.GameStage;
import de.cs8898.libGDX.first.stage.Play;

public class GameStageManager {

	public de.cs8898.libGDX.first.main main;
	private Stack<GameStage> gameStages;
	public static final int PLAY = 123;
	
	public GameStageManager(de.cs8898.libGDX.first.main main) {
		this.main = main;
		gameStages = new Stack<GameStage>();
		pushStage(PLAY);	
	}
	
	public void update(float dt){
		gameStages.peek().update(dt);
	}
	
	public void render() {
		gameStages.peek().render();
	}
	
	private GameStage getStage(int stage) {
		if(stage == PLAY) return new Play(this);
		return null;
	}
	
	public void setStage(int stage) {
		popStage();
		pushStage(stage);
	}
	
	public void pushStage( int stage ){
		gameStages.push(getStage(stage));
	}
	
	public void popStage(){
		GameStage g = gameStages.pop();
		g.dispose();
	}
	
	
	
}
