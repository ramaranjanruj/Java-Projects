package javagame;

import org.lwjgl.input.*;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{
	
	Image playNow;
	Image exitGame;
	
	public Menu(int state){
			
	}
		
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		playNow = new Image("res/play.png");
		exitGame = new Image("res/Exit.png");
	}
	
	//	This method is for drawing things on the screen
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawString("Welcome to the land of Razor!", 100, 50);
		playNow.draw(100,100);
		exitGame.draw(105,150);
	}
		
	//The update method is for updating information on the screen.
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		
		int posX = Mouse.getX();
		int posY = Mouse.getY();
		
		//playNow button
		if((posX>100 && posX <249)&&(posY>220 && posY <260)){
			if(Mouse.isButtonDown(0)){
				sbg.enterState(1);
			}
		}
		
		//exitGame button
		if((posX>105 && posX <240)&&(posY>177 && posY <210)){
			if(Mouse.isButtonDown(0)){
				System.exit(0);
			}
		}
	}
		
	public int getID(){
		return 0;
	}
}
